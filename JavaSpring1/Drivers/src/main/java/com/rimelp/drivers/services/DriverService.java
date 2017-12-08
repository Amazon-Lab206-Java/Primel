package com.rimelp.drivers.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rimelp.drivers.models.License;
import com.rimelp.drivers.models.Person;
import com.rimelp.drivers.repositories.LicenseRepository;
import com.rimelp.drivers.repositories.PersonRepository;

@Service
public class DriverService {
	private final PersonRepository personRepo;
	private final LicenseRepository licenseRepo;
	
	public DriverService(PersonRepository personRepo, LicenseRepository licenseRepo) {
		this.personRepo = personRepo;
		this.licenseRepo = licenseRepo;
	}
	
	public List<Person> allPersons() {
		return personRepo.findAll();
	}
	
	public Person createPerson(Person person) {
		return personRepo.save(person);
	}
	
	public Person getPerson(Long id) {
		return personRepo.findOne(id);
	}
	
	public License createLicense(License license) {
		Long personId = license.getPerson().getId();
		String licNumber = String.format("%06d", personId);
		license.setNumber(licNumber);
		License lic = licenseRepo.save(license);
		
		return lic;
	}
}

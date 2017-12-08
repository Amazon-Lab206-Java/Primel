package com.rimelp.dojoninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rimelp.dojoninjas.models.Dojo;
import com.rimelp.dojoninjas.models.Ninja;
import com.rimelp.dojoninjas.repositories.DojoRepository;
import com.rimelp.dojoninjas.repositories.NinjaRepository;

@Service
public class DojoService {

	private final DojoRepository dojoRepo;
	private final NinjaRepository ninjaRepo;
	
	public DojoService(DojoRepository dojoRepo, NinjaRepository ninjaRepo) {
		this.dojoRepo = dojoRepo;
		this.ninjaRepo = ninjaRepo;
	}
	
	public List<Dojo> allDojos() {
		return dojoRepo.findAll();
	}
	
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public Dojo getDojo(Long id) {
		return dojoRepo.findOne(id);
	}
	
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
}

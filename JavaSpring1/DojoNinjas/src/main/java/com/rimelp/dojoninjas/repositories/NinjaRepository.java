package com.rimelp.dojoninjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rimelp.dojoninjas.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository <Ninja, Long> {

}

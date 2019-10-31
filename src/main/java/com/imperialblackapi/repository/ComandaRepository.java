package com.imperialblackapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.imperialblackapi.model.Comanda;

@Repository
public interface ComandaRepository extends CrudRepository<Comanda, Long>{

}

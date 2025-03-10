package com.gestionAlaCombate.microservicioAeronaves.repository;

import com.gestionAlaCombate.microservicioAeronaves.model.Aircraft;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface AircraftRepository extends MongoRepository<Aircraft, String> {}
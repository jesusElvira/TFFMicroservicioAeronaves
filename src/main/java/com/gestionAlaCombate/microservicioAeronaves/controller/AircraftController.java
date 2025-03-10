package com.gestionAlaCombate.microservicioAeronaves.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.gestionAlaCombate.microservicioAeronaves.model.Aircraft;
import com.gestionAlaCombate.microservicioAeronaves.service.AircraftService;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/aircrafts")
public class AircraftController {
    @Autowired
    private AircraftService service;

    @GetMapping
    public List<Aircraft> getAllAircrafts() { return service.getAllAircrafts(); }

    @GetMapping("/{id}")
    public Optional<Aircraft> getAircraft(@PathVariable String id) { return service.getAircraftById(id); }

    @PostMapping
    public Aircraft addAircraft(@RequestBody Aircraft aircraft) { return service.addAircraft(aircraft); }

    @DeleteMapping("/{id}")
    public void deleteAircraft(@PathVariable String id) { service.deleteAircraft(id); }
}

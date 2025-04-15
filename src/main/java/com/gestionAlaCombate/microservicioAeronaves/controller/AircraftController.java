package com.gestionAlaCombate.microservicioAeronaves.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.gestionAlaCombate.microservicioAeronaves.model.Aircraft;
import com.gestionAlaCombate.microservicioAeronaves.service.AircraftService;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/aircrafts")
public class AircraftController {
    @Autowired
    private AircraftService service;

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<Aircraft> getAllAircrafts() { return service.getAllAircrafts(); }

    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public Optional<Aircraft> getAircraft(@PathVariable String id) { return service.getAircraftById(id); }

    @CrossOrigin(origins = "*")
    @PostMapping
    public Aircraft addAircraft(@RequestBody Aircraft aircraft) { return service.addAircraft(aircraft); }

    @CrossOrigin(origins = "*")
    @PutMapping("/{id}")
    public Aircraft updateAircraft(@PathVariable String id, @RequestBody Aircraft aircraft) {
        return service.updateAircraft(id, aircraft);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
    public void deleteAircraft(@PathVariable String id) { service.deleteAircraft(id); }
}

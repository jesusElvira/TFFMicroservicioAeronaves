package com.gestionAlaCombate.microservicioAeronaves.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.gestionAlaCombate.microservicioAeronaves.model.Aircraft;
import com.gestionAlaCombate.microservicioAeronaves.repository.AircraftRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AircraftService {
    @Autowired
    private AircraftRepository repository;

    public List<Aircraft> getAllAircrafts() { return repository.findAll(); }
    public Optional<Aircraft> getAircraftById(String id) { return repository.findById(id); }
    public Aircraft addAircraft(Aircraft aircraft) { return repository.save(aircraft); }
    public void deleteAircraft(String id) { repository.deleteById(id); }

    public Aircraft updateAircraft(String id, Aircraft aircraft) {
        // Busca el piloto existente por ID
        Aircraft existingAircraft = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aeronave no encontrado"));

        // Actualiza los campos del piloto existente
        existingAircraft.setModel(aircraft.getModel());
        existingAircraft.setYear(aircraft.getYear());
        existingAircraft.setTailNumber(aircraft.getTailNumber());

        // Guarda el piloto actualizado en MongoDB
        return repository.save(existingAircraft);
    }

}

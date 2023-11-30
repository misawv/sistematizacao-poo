package br.com.misaw.sistematizacaopoo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.misaw.sistematizacaopoo.entities.Vehicle;

public interface IVehicleRepository extends JpaRepository<Vehicle, Integer> {
    
}

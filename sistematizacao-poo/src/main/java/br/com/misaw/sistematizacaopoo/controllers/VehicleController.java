package br.com.misaw.sistematizacaopoo.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.misaw.sistematizacaopoo.entities.Vehicle;
import br.com.misaw.sistematizacaopoo.services.IVehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    private IVehicleService service;

    @PostMapping()
    public ResponseEntity<Vehicle> create(@RequestBody Vehicle request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(request));
    }

    @GetMapping()
    public ResponseEntity<List<Vehicle>> findAll() {
        return ResponseEntity.status(HttpStatus.FOUND).body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Vehicle>> findById(@PathVariable Integer id) {

        return ResponseEntity.status(HttpStatus.FOUND).body(service.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable Integer id, @RequestBody Vehicle request) {

        request.setId(id);

        service.update(request);

        return ResponseEntity.status(HttpStatus.OK).body("Veículo atualizado com sucesso!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        service.deleteById(id);

        return ResponseEntity.status(HttpStatus.OK).body("Veículo excluído com sucesso!");
    }
}


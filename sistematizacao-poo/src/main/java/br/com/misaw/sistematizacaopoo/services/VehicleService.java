package br.com.misaw.sistematizacaopoo.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.misaw.sistematizacaopoo.entities.Vehicle;
import br.com.misaw.sistematizacaopoo.repositories.IVehicleRepository;

@Service
public class VehicleService implements IVehicleService {
    
    @Autowired
    private IVehicleRepository repository;

    @Override
    public Vehicle save(Vehicle model) {
        return this.repository.save(model);
       
    }

    @Override
    public List<Vehicle> findAll() {
        return this.repository.findAll();
        
    }

    @Override
    public Optional<Vehicle> findById(Integer id) {
        Optional<Vehicle> vehicle = this.repository.findById(id);

        if(vehicle.isEmpty())
        throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Nenhum veículo encontrado");
                    
        return vehicle;

    }

    @Override
    public Vehicle update(Vehicle model) {
        Optional<Vehicle> vehicle = this.repository.findById(model.getId());
         
        if(vehicle.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Nenhum veículo encontrado");
        }
        
       return this.repository.save(model);
        }

    @Override
    public void deleteById(Integer id) {
        Optional<Vehicle> vehicle = this.repository.findById(id);
        
        if (vehicle.isEmpty()) {

            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
            "Nenhum veículo encontrado");
        }
        this.repository.deleteById(id);
    }

    }


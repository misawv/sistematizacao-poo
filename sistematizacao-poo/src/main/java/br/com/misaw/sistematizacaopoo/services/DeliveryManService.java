package br.com.misaw.sistematizacaopoo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.misaw.sistematizacaopoo.entities.DeliveryMan;
import br.com.misaw.sistematizacaopoo.repositories.IDeliverManRepository;

@Service
public class DeliveryManService implements IDeliveryManService {

    @Autowired
    private IDeliverManRepository repository;

    @Override
    public DeliveryMan save(DeliveryMan model) {
        return this.repository.save(model);
    }

    @Override
    public List<DeliveryMan> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Optional<DeliveryMan> findById(Integer id) {
        Optional<DeliveryMan> deliveryMan = this.repository.findById(id);

        if (deliveryMan.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Nenhum usuário encontrado");

        return deliveryMan;
    }

    @Override
    public DeliveryMan update(DeliveryMan model) {
        Optional<DeliveryMan> deliveryMan = this.repository.findById(model.getId());

        if (deliveryMan.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Nenhum usuário encontrado");
        }

        return this.repository.save(model);
    }

    @Override
    public void deleteById(Integer id) {
        Optional<DeliveryMan> deliveryMan = this.repository.findById(id);

        if (deliveryMan.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Nenhum usuário encontrado");
        }

        this.repository.deleteById(id);
    }
}

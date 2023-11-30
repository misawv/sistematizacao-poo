package br.com.misaw.sistematizacaopoo.services;

import java.util.List;
import java.util.Optional;

import br.com.misaw.sistematizacaopoo.entities.DeliveryMan;

public interface IDeliveryManService {

    DeliveryMan save(DeliveryMan model);

    List<DeliveryMan> findAll();

    Optional<DeliveryMan> findById(Integer id);

    DeliveryMan update(DeliveryMan model);

    void deleteById(Integer id);

}

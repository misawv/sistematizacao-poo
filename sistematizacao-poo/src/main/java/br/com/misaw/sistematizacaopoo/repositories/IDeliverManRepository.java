package br.com.misaw.sistematizacaopoo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.misaw.sistematizacaopoo.entities.DeliveryMan;

public interface IDeliverManRepository extends JpaRepository<DeliveryMan, Integer> {

}
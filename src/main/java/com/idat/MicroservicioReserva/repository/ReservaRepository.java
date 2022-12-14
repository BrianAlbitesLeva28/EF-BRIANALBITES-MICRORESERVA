package com.idat.MicroservicioReserva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MicroservicioReserva.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer>{

}

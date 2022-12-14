package com.idat.MicroservicioReserva.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MicroservicioReserva.DTO.ReservaDTO;
import com.idat.MicroservicioReserva.model.Reserva;
import com.idat.MicroservicioReserva.repository.ReservaRepository;

@Service
public class ReservaServiceImp implements ReservaService {

	@Autowired
	private ReservaRepository repository;

	@Override
	public List<ReservaDTO> listar() {
		List<ReservaDTO> listadto = new ArrayList<>();
		ReservaDTO dto = null;

		for (Reserva reserva : repository.findAll()) {
			dto = new ReservaDTO();
			dto.setCodd(reserva.getIdReserva());
			dto.setCost(reserva.getCosto());
			listadto.add(dto);
		}

		return listadto;
	}

	@Override
	public void guardar(ReservaDTO reserva) {

		Reserva res = new Reserva();
		res.setIdReserva(reserva.getCodd());
		res.setCosto(reserva.getCost());

		repository.save(res);

	}

}

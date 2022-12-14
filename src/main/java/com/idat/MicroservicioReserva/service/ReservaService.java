package com.idat.MicroservicioReserva.service;

import java.util.List;

import com.idat.MicroservicioReserva.DTO.ReservaDTO;

public interface ReservaService {
	
	List<ReservaDTO> listar();
	void guardar(ReservaDTO hospedajeDTO);


}

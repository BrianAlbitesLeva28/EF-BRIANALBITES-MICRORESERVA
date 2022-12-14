package com.idat.MicroservicioReserva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MicroservicioReserva.DTO.ReservaDTO;
import com.idat.MicroservicioReserva.service.ReservaService;

@Controller
@RequestMapping("/api/reserva/v1")
public class ReservaController {
	
	@Autowired
	private ReservaService service;
	
	public @ResponseBody List<ReservaDTO> listar(){
		return service.listar();
	}
	
	public @ResponseBody void guardar(@RequestBody ReservaDTO reserva) {
		service.guardar(reserva);
	}

}

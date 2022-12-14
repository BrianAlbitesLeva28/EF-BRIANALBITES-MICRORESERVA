package com.idat.MicroservicioReserva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EfBrianAlbitesMicroservicioReservaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfBrianAlbitesMicroservicioReservaApplication.class, args);
	}

}

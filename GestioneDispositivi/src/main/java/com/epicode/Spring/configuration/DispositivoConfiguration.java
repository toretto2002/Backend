package com.epicode.Spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.Spring.enumerator.StatoDispositivo;
import com.epicode.Spring.model.Dispositivo;

@Configuration
public class DispositivoConfiguration {

	@Bean
	@Scope("prototype")
	public Dispositivo deviceBean() {
		return new Dispositivo();
	}
	
	@Bean("customDeviceBean")
	@Scope("prototype")
	public Dispositivo customDeviceBean() {
		Dispositivo d = new Dispositivo();
		d.setStato(StatoDispositivo.DISPONIBILE);
		return d;
	}
}



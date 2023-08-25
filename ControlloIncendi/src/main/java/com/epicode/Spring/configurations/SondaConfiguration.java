package com.epicode.Spring.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


import com.epicode.Spring.model.Sonda;

@Configuration
public class SondaConfiguration {

	@Bean("customDeviceBean")
	@Scope("prototype")
	public Sonda sondaBean(String lat, String lon) {
		Sonda s = new Sonda();
		s.setLatitude(lat);
		s.setLongitude(lon);
		s.setSmokeLevel(0);
		return s;
	}
}

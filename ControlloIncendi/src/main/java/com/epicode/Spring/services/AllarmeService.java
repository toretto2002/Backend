package com.epicode.Spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.Spring.model.Allarme;
import com.epicode.Spring.model.Sonda;
import com.epicode.Spring.repositories.AllarmeRepository;

@Service
public class AllarmeService {

	@Autowired
    private AllarmeRepository allarmeRepository;
    
    public void controllaAllarme(Sonda sonda) {
        if (sonda.getSmokeLevel() > 5) {
            Allarme allarme = new Allarme();
            allarme.setSondaId(sonda.getId());
            allarme.setAlarmURL("http://host/alarm?idsonda=" + sonda.getId() +
                                "&lat=" + sonda.getLatitude() +
                                "&lon=" + sonda.getLongitude() +
                                "&smokelevel=" + sonda.getSmokeLevel());
            
            allarmeRepository.save(allarme);
        }
    }
}

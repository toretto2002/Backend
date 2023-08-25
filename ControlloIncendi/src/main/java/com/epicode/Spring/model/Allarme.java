package com.epicode.Spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
@Table(name = "sonde")
public class Allarme {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;	
    private Long sondaId;
    private String alarmURL;
}

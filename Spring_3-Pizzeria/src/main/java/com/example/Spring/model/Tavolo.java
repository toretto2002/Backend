package com.example.Spring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Tavolo {
	
	private int numTavolo;
	private int maxCoperti;
	private boolean occupato;
}

package ar.edu.unlam.recuperatorio.gemas;

import ar.edu.unlam.recuperatorio.Gema;
import ar.edu.unlam.recuperatorio.Hechizable;

public class Espacio extends Gema implements Hechizable{

	
	
	
	public Espacio(String nombre, Integer poder) {
		super(nombre, poder);
		
	}

	@Override
	public Integer multiplicadorDePoder() {
		return 2;
	}

}

package ar.edu.unlam.recuperatorio.gemas;

import ar.edu.unlam.recuperatorio.Gema;
import ar.edu.unlam.recuperatorio.Hechizable;

public class Alma extends Gema implements Hechizable{
		
	private String nombre;
	
	
	public Alma(String nombre, Integer poder) {
		super(nombre,poder);
		
	}

	@Override
	public Integer multiplicadorDePoder() {
		return 2;
	}

}

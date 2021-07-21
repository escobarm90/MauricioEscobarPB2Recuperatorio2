package ar.edu.unlam.recuperatorio;

import java.util.HashSet;
import java.util.Set;

public class Heroe extends Personaje{

	private Heroes nombre;
	private Gema gema;
	
	public Heroe(Heroes nombre, Integer poder, Gema gema) {
		super(poder);
		this.nombre = nombre;
		this.gema = gema;
	}

	public Heroes getNombre() {
		return nombre;
	}

	public Gema getGemas() {
		return gema;
	}
	
	
	
	
	
	
	
	

}

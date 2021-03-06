package ar.edu.unlam.recuperatorio;

import java.util.HashSet;
import java.util.Set;

public class Heroe extends Personaje implements Comparable<Heroe>{

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

	@Override
	public int compareTo(Heroe o) {
		return this.nombre.getName().compareTo(o.nombre.getName());
		
	}

	
	
	}
	
	
	
	
	
	
	
	



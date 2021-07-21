package ar.edu.unlam.recuperatorio;

import java.util.HashSet;
import java.util.Set;

public class Batalla {
	
	
	private Villano villano;
	private Heroe heroe;
	private String ganador;
	private Set<Personaje> ganadores;
	
	public Batalla(Villano villano, Heroe heroe) {
		this.villano = villano;
		this.heroe = heroe;
	}
		
	public String getGanadorBatalla(Villano villano, Heroe heroe) {
		if(villano.getPoder()>heroe.getPoder()) {
			ganador = villano.getNombre().getName();
		}else if(villano.getPoder()<heroe.getPoder() ) {
			ganador = heroe.getNombre().getName();
		}return ganador;
	}
	
	
	
	
	
}

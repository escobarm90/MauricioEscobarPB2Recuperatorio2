package ar.edu.unlam.recuperatorio;

import java.util.HashSet;
import java.util.Set;

public class Batalla {
	
	
	private Villano villano;
	private Heroe heroe;
	private String ganador;
	private Set<Villano> villanosGanadores = new HashSet<Villano>();
	private Set<Heroe> heroesGanadores = new HashSet<Heroe>();
	
	public Batalla(Villano villano, Heroe heroe) {
		this.villano = villano;
		this.heroe = heroe;
	}
		
	public String getGanadorBatalla(Villano villano, Heroe heroe) {
		if(villano.getPoder()>heroe.getPoder()) {
			ganador = villano.getNombre().getName();
			villanosGanadores.add(villano);
		}else if(villano.getPoder()<heroe.getPoder() ) {
			ganador = heroe.getNombre().getName();
			heroesGanadores.add(heroe);
		}return ganador;
	}
	
	
	
	
	
}

package ar.edu.unlam.recuperatorio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.edu.unlam.practica1.EXCEPTIONS.VehiculoIncompatibleException;

public class MarvelTest {

	
	@Test
	public void queCadaHeroeOVillanoCuenteConUnPoderInicial() {
		
		Heroe thor = new Heroe(Heroes.Thor,50);
		Villano loki = new Villano(Villanos.Loki,60);
		
		Integer poderThor = 50; 
		Integer poderLoki = 60;
		
		assertEquals(poderThor,thor.getPoder());
		assertEquals(poderLoki,loki.getPoder());
	}
	
	@Test
	public void queCuandoUnPersonajePoseaUnaGemaSeMultipliqueSuPoder() {
		Heroe thor = new Heroe(Heroes.Thor,50);
		Villano loki = new Villano(Villanos.Loki,60);
		Gema tiempo = new Gema(NombresGemas.TIEMPO);
		
		thor.poseerGema(tiempo);
		Integer poderThor = 150; 
		assertEquals(poderThor,thor.getPoder());		
	}
	
	@Test (expected=CantidadDeGemasExedidaException.class)
	public void queLasGemasSeanRepartidasEntreHeroesYVillanos() {
		Heroe thor = new Heroe(Heroes.Thor,50);
		Gema tiempo = new Gema(NombresGemas.TIEMPO);
		Gema alma = new Gema(NombresGemas.ALMA);
		Gema espacio = new Gema(NombresGemas.ESPACIO);
		Gema mente = new Gema(NombresGemas.MENTE);
		
		thor.poseerGema(tiempo);
		thor.poseerGema(alma);
		thor.poseerGema(espacio);
		thor.poseerGema(mente);
	}
	
	
}

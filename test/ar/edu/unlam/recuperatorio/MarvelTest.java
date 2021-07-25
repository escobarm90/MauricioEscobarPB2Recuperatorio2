package ar.edu.unlam.recuperatorio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.edu.unlam.recuperatorio.gemas.Alma;
import ar.edu.unlam.recuperatorio.gemas.Espacio;
import ar.edu.unlam.recuperatorio.gemas.Mente;
import ar.edu.unlam.recuperatorio.gemas.Tiempo;


public class MarvelTest {

	
	@Test
	public void queCadaHeroeOVillanoCuenteConUnPoderInicial() {
		
		Gema tiempo = new Tiempo("TIEMPO",50);
		Heroe thor = new Heroe(Heroes.THOR,50,tiempo);
		Villano loki = new Villano(Villanos.LOKI,60);
		
		Integer poderThor = 50; 
		Integer poderLoki = 60;
		
		assertEquals(poderThor,thor.getPoder());
		assertEquals(poderLoki,loki.getPoder());
	}
	
	@Test
	public void queCuandoUnPersonajePoseaUnaGemaSeMultipliqueSuPoder() throws Exception {
		Gema tiempo = new Tiempo("TIEMPO",50);
		
		Heroe thor = new Heroe(Heroes.THOR,50,tiempo);
		Villano loki = new Villano(Villanos.LOKI,60);
		
		
		thor.poseerGema(tiempo);
		Integer poderThor = 150; 
		assertEquals(poderThor,thor.getPoder());		
	}
	

	
	@Test
	public void queEnUnaBatallaGaneElPersonajeConMasPoder() throws Exception {
		
		Gema tiempo = new Tiempo("TIEMPO",50);
		Gema alma = new Alma("TIEMPO",50);
		
		Heroe thor = new Heroe(Heroes.THOR,50,tiempo);
		Villano loki = new Villano(Villanos.LOKI,60);
		
		thor.poseerGema(tiempo);
		loki.poseerGema(alma);
		
	}
	
	@Test
	public void obtenerListaDeVillanosGanadoresDeManeraDescendiente() throws Exception {
		Gema tiempo = new Tiempo("TIEMPO",50);
		Gema alma = new Alma("TIEMPO",50);
		
		Heroe hulk = new Heroe(Heroes.HULK,50,tiempo);
		Villano loki = new Villano(Villanos.LOKI,90);
		
		hulk.poseerGema(tiempo);
		loki.poseerGema(alma);
		
		
		Heroe ironMan = new Heroe(Heroes.IRON_MAN,50,tiempo);
		Villano ronnan = new Villano(Villanos.RONNAN,60);
		
		ironMan.poseerGema(tiempo);
		ronnan.poseerGema(alma);
		
		Heroe blackWidow = new Heroe(Heroes.BLACK_WIDOW,50,tiempo);
		Villano soldadoInvierno = new Villano(Villanos.SOLDADO_DEL_INVIERNO,60);
		
		blackWidow.poseerGema(tiempo);
		soldadoInvierno.poseerGema(alma);
		
		Batalla nueva = new Batalla(loki,hulk);
		nueva.getGanadorBatalla(ronnan, ironMan);
		nueva.getGanadorBatalla(soldadoInvierno, ironMan);
		
	}
	
	
}

package ar.edu.unlam.recuperatorio;

public abstract class Personaje {
	

	private Integer poder;
	private Integer cantidadDegemas = 0;

	public Personaje(Integer poder) {		
		this.poder = poder;
	}

	public Integer getPoder() {
		return poder;
	}	
	
	public void poseerGema(Gema gema) {
		if(this.cantidadDegemas<=3) {
		this.poder = poder * gema.getMultiplicadorDePoder();
		this.cantidadDegemas++;
			}
	}


}

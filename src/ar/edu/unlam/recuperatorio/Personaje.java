package ar.edu.unlam.recuperatorio;

public abstract class Personaje {
	
	private static Integer contador = 1;
	private Integer poder;
	private Integer cantidadDegemas = 0;
	private Gema gema = null;

	public Personaje(Integer poder) {		
		this.poder = poder;
	}

	public Integer getPoder() {
		return poder;
	}	
	
	public void poseerGema(Gema gema)throws Exception {
		if(this.cantidadDegemas<=1) {
		this.poder = poder * gema.multiplicadorDePoder();		
		}else throw new CantidadDeGemasExedidaException("maxima");
	}


}

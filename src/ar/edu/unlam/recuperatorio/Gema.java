package ar.edu.unlam.recuperatorio;

public abstract class Gema {
	
	private Integer poder;
	private String nombre;
	
	public Gema(String nombre, Integer poder) {
		this.poder = poder;
		this.nombre = nombre;
	}
	
	public Integer multiplicadorDePoder() {
		return poder;
	}
	

}

package ar.edu.unlam.recuperatorio;

public class Gema {
	
	private NombresGemas nombreGema;
	private Integer aumentoPoder = 0;
	
	public Gema(NombresGemas nombreGema) {
		this.nombreGema = nombreGema;
	}
	
	public void aumentoDePoder(NombresGemas nombre) {
		if(nombre.equals(NombresGemas.TIEMPO) || nombre.equals(NombresGemas.MENTE) || nombre.equals(NombresGemas.PODER)) {
			aumentoPoder = 3;
		}else if (nombre.equals(NombresGemas.ALMA) || nombre.equals(NombresGemas.ESPACIO) || nombre.equals(NombresGemas.REALIDAD)) {
			aumentoPoder = 2;
		}
	}
	
	public Integer getMultiplicadorDePoder() {		
		aumentoDePoder(nombreGema);
		return this.aumentoPoder;
	}

}

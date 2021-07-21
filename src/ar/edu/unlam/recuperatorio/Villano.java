package ar.edu.unlam.recuperatorio;

import java.util.HashSet;
import java.util.Set;

public class Villano extends Personaje implements Comparable<Villano> {
	


	private Villanos nombre;
	private Gema gema;
	
		public Villano(Villanos nombre, Integer poder) {
			super(poder);
			this.nombre = nombre;
			this.gema = gema;
		}

		public Villanos getNombre() {
			return nombre;
		}

	

		@Override
		public int compareTo(Villano o) {
			return o.nombre.getName().compareTo(this.nombre.getName());
		}
	
		
		
		
		

}

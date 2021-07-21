package ar.edu.unlam.recuperatorio;

import java.util.HashSet;
import java.util.Set;

public class Villano extends Personaje implements Comparable<String> {
	


	private Villanos nombre;
	private Set<Gema> gemas;
	
		public Villano(Villanos nombre, Integer poder) {
			super(poder);
			this.nombre = nombre;
			this.gemas = new HashSet<Gema>();
		}

		public Villanos getNombre() {
			return nombre;
		}

		public Set<Gema> getGemas() {
			return gemas;
		}

		@Override
		public int compareTo(String o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
		
		

}

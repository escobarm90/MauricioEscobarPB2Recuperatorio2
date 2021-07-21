package ar.edu.unlam.recuperatorio;

public enum Villanos {

	
	
	LOKI("Loki"),
	RONNAN("Ronnan"),
	RED_SKULL("Red_Skull"),
	SOLDADO_DEL_INVIERNO("Soldado_del_invierno"),
	HELA("Hela");
	
	private String name;
	
	 Villanos(String name) {
		this.name = name;
	}
	 public String getName() {
		 return name;
	 }
}

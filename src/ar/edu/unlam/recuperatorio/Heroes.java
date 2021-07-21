package ar.edu.unlam.recuperatorio;

public enum Heroes {

	THOR("Thor"),
	CAPITAN_AMERICA("Capitan america"),
	HULK("Hulk"),
	BLACK_WIDOW("Black Widow"),
	IRON_MAN("Iron Man");	
	
	private String name;
	
	 Heroes(String name) {
		this.name = name;
	}
	 public String getName() {
		 return name;
	 }
}
	


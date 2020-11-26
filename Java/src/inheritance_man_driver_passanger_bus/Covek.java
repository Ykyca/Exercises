package inheritance_man_driver_passanger_bus;

public class Covek {

	/*
	 * Covek ima ime i prezime, dodeljuju se prilikom kreiranja objekta.
	 * Svi podaci mogu da se dohvate, ne mogu da se postave.
	 */
	//OVO JE SUPER KLASA
	
	String ime;
	String prezime;
	
	public Covek (String ime, String prezime) {
		super();
		this.ime=ime;
		this.prezime=prezime;
	}
	
	public String getIme() {
		return ime;
	}
	
	public String getPrezime() {
		return prezime;
	}

    public String prikaziCoveka() {
        StringBuilder sb = new StringBuilder();
        return sb.append(getIme()).append("_").append(getPrezime()).toString();
    }

}

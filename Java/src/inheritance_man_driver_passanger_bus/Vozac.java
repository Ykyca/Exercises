package inheritance_man_driver_passanger_bus;

public class Vozac extends Covek {
	/*
	 * Vozac je covek. On ima i zanimanje -> sofer).
	 * 
	 */

	private String zvanje;
	
	public Vozac(String ime, String prezime) {
		super(ime, prezime);
		this.zvanje="vozac";
		// TODO Auto-generated constructor stub
	}
	
	
	public StringBuilder whoIsVozac () {
		StringBuilder sb = new StringBuilder();
		return sb.append(ime).append(" ").append(prezime).append(" je po profesiji ").append(zvanje);
	}
	
	
}

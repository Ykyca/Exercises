package inheritance_man_driver_passanger_bus;

public class Inheritence_main {

	public static void main(String[] args) {

		Covek c = new Covek("Ivana", "Radovanovic");
		
		System.out.println(c.getIme());
		System.out.println(c.getPrezime());
		System.out.println(c.prikaziCoveka());
		
		System.out.println(" ");
		System.out.println(" ");
		Putnik p = new Putnik("Biljana", "Urosevica", 500);
		
		p.dodajNovac(200);
		p.oduzmiNovac(600);
		System.out.println(p.prikaziPutnika());

		System.out.println(" ");
		System.out.println(" ");
		Vozac v = new Vozac("Gojko", "Gojkovic");
		System.out.println(v.whoIsVozac());
	}

}

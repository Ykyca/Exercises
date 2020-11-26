package inheritance_man_driver_passanger_bus;

public class Putnik extends Covek {

	/*
	 * Putnik je covek koji ima novac. Inicijalno ima neku svotu novca koja mu se
	 * daje prilikom kreiranja. Novac moze da mu se doda ili oduzme- tu je potrebno
	 * vratiti indikator uspesnosti.
	 */

	private double svotaNovca;

	public Putnik(String ime, String prezime, double svotaNovca) {
		super(ime, prezime);
		this.svotaNovca = svotaNovca;
	}

	public double dodajNovac(double svota) {
		System.out.println("Stara svota: " + svotaNovca);
		if (svota > 0) {
			svotaNovca = svota + svotaNovca;
			System.out.println("Svota uspesno dodata");
			System.out.println("Nova svota: " + svotaNovca);
		} else {
			System.out.println("Svota 0 ne moze biti dodata");
		}
		return svotaNovca;
	}

	public double oduzmiNovac(double svota) {
		System.out.println("Stara svota: " + svotaNovca);
		if (svota <= svotaNovca && svotaNovca > 0) {
			svotaNovca = svotaNovca - svota;
			System.out.println("Svota uspesno oduzeta");
			System.out.println("Nova svota: " + svotaNovca);
		} else {
			System.out.println("Svota novca za oduzimanje ne moze biti veca od trenutne svote novca.");
		}
		return svotaNovca;
	}

	public StringBuilder prikaziPutnika() {
		StringBuilder sb = new StringBuilder();
		return sb.append(ime).append(" ").append(prezime).append(" ima: ").append(svotaNovca).append(" dinara");
	}

}

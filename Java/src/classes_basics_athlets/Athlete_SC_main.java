package classes_basics_athlets;

public class Athlete_SC_main {

	public static void main(String[] args) {

		//athlete class check
		Athlete a = new Athlete("Ivana", "Radovanovic", 2015);

		System.out.println(a.getName());
		System.out.println(a.getLastName());
		System.out.println(a.getYearOfBirth());
		System.out.println("-------------");
		a.showAthleteData();
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");

		Athlete b = new Athlete("Biljana", "Urosevic", 1996);

		System.out.println("-----------------------------");
		System.out.println(b.getName());
		System.out.println(b.getLastName());
		System.out.println(b.getYearOfBirth());
		System.out.println("-------------");
		b.showAthleteData();
		System.out.println("-----------------------------");
		
		//sportsClub class check
		
	Sports_club sc = new Sports_club("Belgrade", 1989, 5);
	sc.setName("TestClub");
	sc.addAthlete(a);
	sc.addAthlete(b);
	sc.showClubInfo();	//sredi showclub info jer radi point na memoriju, a ne izbacuje podatke	
	
	}

}

package classes_basics_athlets;

public class Sports_club {
	/*
	 * Sports club has a name, city, foundationYear, all athletes (array). All
	 * fields have getters. Name of a club has both getter and setter. Write
	 * methods: add a method that will show all available data of the object. Don't
	 * forget to manage adding/deleting an athlete from an array.
	 */

	// fields
	private String name;
	private String city;
	private int fYear;
	private Athlete[] athlets;

	// Constructor
	public Sports_club(String city, int fYear, int numberOfAthletes) {
		this.city = city;
		this.fYear = fYear;
		this.athlets = new Athlete[numberOfAthletes];
	}

	// methods
	public String getName() {
		return name;
	}

	public void setName(String club_name) {
		name = club_name;
	}

	public String getCity() {
		return city;
	}

	public int getFyear() {
		return fYear;
	}

	public int getNuberOfAthletes() {
		return athlets.length;
		// treba li this.athlets.length;
	}

	public Athlete[] getAllAthletes() {
		return athlets;
	}

	public boolean addAthlete(Athlete a) {
		for (int i = 0; i < athlets.length; i++) {
			if (athlets[i] == null) {
				this.athlets[i] = a;
				System.out.println("Athlete added");
				return true;
			}
		}
		return false;
	}

	public boolean removeAthlete(Athlete a) {
		for (int i = 0; i < athlets.length; i++) {
			if (athlets[i] != null) {
				athlets[i] = null;
				System.out.println("Athlet removed");
				return true;
			}
		}
		return false;
	}

	// treba li @Override?
	public void showClubInfo() {
		System.out.println("Name of the club: " + name);
		System.out.println("Name of the city of the club: " + city);
		System.out.println("Year of foundation: " + fYear);

		String data = " ";
		for (int i = 0; i < athlets.length; i++) {
			if (athlets[i] != null) {
				data = athlets[i].toString();
				System.out.println(data);
				System.out.println();
			}
		}

	}
}

package Sets.HandsOnAssignment1;

public class Main {
	public static void main(String[] args) {
        Country c = new Country();
        c.saveCountryNames("India");
        c.saveCountryNames("USA");
        c.saveCountryNames("Japan");
        c.saveCountryNames("Australia");
        c.saveCountryNames("Canada");
        System.out.println("HashSet: " + c.H1);
        System.out.println("Search India: " + c.getCountry("India"));
        System.out.println("Search China: " + c.getCountry("China"));
    }
}

package Map.HandsOnAssignment5;

public class Main {
	public static void main(String[] args) {
        CountryMap c = new CountryMap();
        c.saveCountryCapital("India", "Delhi");
        c.saveCountryCapital("Japan", "Tokyo");
        c.saveCountryCapital("USA", "Washington");
        c.saveCountryCapital("Australia", "Canberra");
        System.out.println("TreeMap M1 : " + c.M1);
        System.out.println("\nCapital of India : " + c.getCapital("India"));
        System.out.println("Country of Tokyo : " + c.getCountry("Tokyo"));
        System.out.println("\nReverse Map M2 : " + c.createReverseMap());
        System.out.println("\nCountry List : " + c.getCountryList());
    }
}

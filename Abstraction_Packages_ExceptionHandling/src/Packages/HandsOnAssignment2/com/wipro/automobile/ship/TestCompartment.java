package Packages.HandsOnAssignment2.com.wipro.automobile.ship;

public class TestCompartment {
	public static void main(String[] args) {
        compartment c = new compartment(10.5, 20.0, 15.5);
        System.out.println("Height: " + c.getHeight());
        System.out.println("Width: " + c.getWidth());
        System.out.println("Breadth: " + c.getBreadth());
    }
}

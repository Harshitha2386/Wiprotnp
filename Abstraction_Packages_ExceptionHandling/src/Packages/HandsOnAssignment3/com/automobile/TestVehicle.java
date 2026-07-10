package Packages.HandsOnAssignment3.com.automobile;
import Packages.HandsOnAssignment3.com.automobile.twowheeler.Hero;
import Packages.HandsOnAssignment3.com.automobile.fourwheeler.Honda;
public class TestVehicle {
	public static void main(String[] args) {
        Hero h = new Hero();
        System.out.println("----- Hero -----");
        System.out.println("Model: " + h.getModelName());
        System.out.println("Registration: " + h.getRegistrationNumber());
        System.out.println("Owner: " + h.getOwnerName());
        System.out.println("Speed: " + h.getSpeed());
        h.radio();
        System.out.println();
        Honda c = new Honda();
        System.out.println("----- Honda -----");
        System.out.println("Model: " + c.getModelName());
        System.out.println("Registration: " + c.getRegistrationNumber());
        System.out.println("Owner: " + c.getOwnerName());
        System.out.println("Speed: " + c.getSpeed());
        c.cdplayer();
    }
}

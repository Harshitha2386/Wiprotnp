package Packages.HandsOnAssignment4.com.automobile;
import Packages.HandsOnAssignment4.com.automobile.twowheeler.Hero;
import Packages.HandsOnAssignment4.com.automobile.fourwheeler.Honda;
import Packages.HandsOnAssignment4.com.automobile.fourwheeler.Logan;
import Packages.HandsOnAssignment4.com.automobile.fourwheeler.Ford;
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
        
        Logan l = new Logan();
        System.out.println("----- Logan -----");
        System.out.println("Model : " + l.getModelName());
        System.out.println("Registration : " + l.getRegistrationNumber());
        System.out.println("Owner : " + l.getOwnerName());
        System.out.println("Speed : " + l.speed());
        l.gps();
        System.out.println();
        Ford f = new Ford();
        
        System.out.println("----- Ford -----");
        System.out.println("Model : " + f.getModelName());
        System.out.println("Registration : " + f.getRegistrationNumber());
        System.out.println("Owner : " + f.getOwnerName());
        System.out.println("Speed : " + f.speed());
        f.tempControl();
    }
}

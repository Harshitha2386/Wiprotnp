package Packages.HandsOnAssignment4.com.automobile.twowheeler;
import Packages.HandsOnAssignment4.com.automobile.Vehicle;
public class Hero extends Vehicle {
    public String getModelName(){
        return "Hero Splendor";
    }
    public String getRegistrationNumber(){
        return "AP39AB1234";
    }
    public String getOwnerName(){
        return "Harshitha";
    }
    public int getSpeed(){
        return 80;
    }
    public void radio(){
        System.out.println("Radio is ON");
    }
}

package Packages.HandsOnAssignment4.com.automobile.fourwheeler;
import Packages.HandsOnAssignment4.com.automobile.Vehicle;

public class Ford extends Vehicle{
    public String getModelName(){
        return "Ford";
    }
    public String getRegistrationNumber(){
        return "AP39FD5678";
    }
    public String getOwnerName(){
        return "Harshitha";
    }
    public int speed(){
        return 140;
    }
    public void tempControl(){
        System.out.println("Air Conditioner is ON");
    }
}
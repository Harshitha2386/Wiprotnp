package Packages.HandsOnAssignment4.com.automobile.fourwheeler;
import Packages.HandsOnAssignment4.com.automobile.Vehicle;
public class Logan extends Vehicle{
    public String getModelName(){
        return "Logan";
    }
    public String getRegistrationNumber(){
        return "AP39LG1234";
    }
    public String getOwnerName(){
        return "Harshitha";
    }
    public int speed(){
        return 120;
    }
    public void gps(){
        System.out.println("GPS is ON");
    }
}

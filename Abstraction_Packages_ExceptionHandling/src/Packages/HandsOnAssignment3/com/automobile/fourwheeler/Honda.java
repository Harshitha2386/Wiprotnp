package Packages.HandsOnAssignment3.com.automobile.fourwheeler;

import Packages.HandsOnAssignment3.com.automobile.Vehicle;
public class Honda extends Vehicle{
    public String getModelName(){
        return "Honda City";
    }
    public String getRegistrationNumber(){
        return "AP39CD5678";
    }
    public String getOwnerName(){
        return "Harshitha";
    }
    public int getSpeed(){
        return 120;
    }
    public void cdplayer(){
        System.out.println("CD Player is ON");
    }
}

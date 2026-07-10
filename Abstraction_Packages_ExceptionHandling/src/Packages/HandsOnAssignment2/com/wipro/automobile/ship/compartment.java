package Packages.HandsOnAssignment2.com.wipro.automobile.ship;

public class compartment {
	private double height;
    private double width;
    private double breadth;
    public compartment(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public double getBreadth(){
        return breadth;
    }
}

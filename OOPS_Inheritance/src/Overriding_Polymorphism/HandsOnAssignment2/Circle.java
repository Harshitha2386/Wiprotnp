package Overriding_Polymorphism.HandsOnAssignment2;

public class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Circle");
    }
    @Override
    void erase(){
        System.out.println("Erasing Circle");
    }
}

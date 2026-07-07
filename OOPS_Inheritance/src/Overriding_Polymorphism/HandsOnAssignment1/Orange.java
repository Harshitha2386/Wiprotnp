package Overriding_Polymorphism.HandsOnAssignment1;

public class Orange extends Fruit {
    Orange(String name, String taste, String size){
        super(name, taste, size);
    }
    @Override
    void eat(){
        System.out.println(name + " tastes Sour");
    }
}

package Overriding_Polymorphism.HandsOnAssignment1;

public class TestFruit {
	public static void main(String[] args){
        Fruit f = new Fruit("Fruit", "Normal", "Medium");
        Apple a = new Apple("Apple", "Sweet", "Medium");
        Orange o = new Orange("Orange", "Sour", "Medium");
        f.eat();
        a.eat();
        o.eat();
    }
}

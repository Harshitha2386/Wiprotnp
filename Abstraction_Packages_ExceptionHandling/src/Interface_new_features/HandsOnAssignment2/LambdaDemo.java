package Interface_new_features.HandsOnAssignment2;

public class LambdaDemo {
	public static void main(String[] args) {
        Test t1 = (a, b, c) -> a + b + c;
        Test t2 = (a, b, c) -> a * b * c;
        System.out.println("Addition = " + t1.myFunction(30, 60, 90));
        System.out.println("Multiplication = " + t2.myFunction(30, 60, 90));
    }
}

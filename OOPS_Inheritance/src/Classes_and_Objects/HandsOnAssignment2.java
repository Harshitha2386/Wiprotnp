package Classes_and_Objects;
class Calculator {
    static int powerInt(int num1, int num2){
        return (int) Math.pow(num1, num2);
    }
    static double powerDouble(double num1, int num2){
        return Math.pow(num1, num2);
    }
}
public class HandsOnAssignment2 {
	public static void main(String[] args){
        int res1 = Calculator.powerInt(3, 6);
        double res2 = Calculator.powerDouble(3.5, 2);

        System.out.println("Power of int: " + res1);
        System.out.println("Power of double: " + res2);
    }
}

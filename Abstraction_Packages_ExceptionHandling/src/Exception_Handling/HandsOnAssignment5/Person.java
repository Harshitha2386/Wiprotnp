package Exception_Handling.HandsOnAssignment5;

public class Person {
    public static void main(String[] args) {

        try {

            if (args.length != 2) {
                throw new InvalidAgeException("Please enter Name and Age.");
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Age should be between 18 and 60.");
            }

            System.out.println("Name : " + name);
            System.out.println("Age : " + age);

        }
        catch (NumberFormatException e) {
            System.out.println("Age must be an integer.");
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

package Interface_new_features.HandsOnAssignment1;

public interface Vehicle {

    default void message() {
        System.out.println("Inside Vehicle");
    }
}
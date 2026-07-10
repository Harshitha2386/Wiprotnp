package Interface_new_features.HandsOnAssignment1;

public interface FourWheeler {

    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

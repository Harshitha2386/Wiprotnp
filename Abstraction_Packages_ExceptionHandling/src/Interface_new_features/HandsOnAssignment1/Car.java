package Interface_new_features.HandsOnAssignment1;

public class Car implements Vehicle, FourWheeler {
    @Override
    public void message() {
        Vehicle.super.message();
    }
}
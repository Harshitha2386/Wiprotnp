package Optional_Class;
import java.util.Optional;
public class HandsnoAssignment2 {
	public static void main(String[] args) {
        String addr = null;
        Optional<String> value = Optional.ofNullable(addr);
        System.out.println(value.orElse("India"));
    }
}

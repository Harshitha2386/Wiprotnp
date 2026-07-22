package Thread_Creation;
import java.util.Random;
class ColourThread implements Runnable {
    public void run() {
        String colours[] = {"white", "blue", "black", "green", "red", "yellow"};
        Random random = new Random();
        while (true) {
            int index = random.nextInt(colours.length);
            System.out.println(colours[index]);
            if (colours[index].equals("red")) {
                break;
            }
        }
    }
}
public class HandsOnAssignment2 {
	 public static void main(String[] args) {
	        Thread th = new Thread(new ColourThread());
	        th.start();
	    }
}

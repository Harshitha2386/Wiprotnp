package Thread_Control_and_Priorites;
class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}
class OddThread extends Thread {
    public void run() {
        for (int i = 1; i < 20; i += 2) {
            System.out.println(i);
        }
    }
}
public class HandsOnAssignment2 {
	public static void main(String[] args) {
        EvenThread evenno = new EvenThread();
        OddThread oddno = new OddThread();
        evenno.start();
        try {
            evenno.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        oddno.start();
    }
}

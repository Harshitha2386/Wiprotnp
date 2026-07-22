package Thread_Creation;
class MyThread extends Thread {
    MyThread(String name) {
        super(name); 
    }
    public void run() {

    }
}
public class HandsOnAssignment1 {
	public static void main(String[] args) {
        MyThread t1 = new MyThread("Scooby");
        MyThread t2 = new MyThread("Shaggy");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }
}

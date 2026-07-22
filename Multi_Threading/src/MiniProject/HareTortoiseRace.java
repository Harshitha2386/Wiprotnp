package MiniProject;
class HTRaceThread extends Thread {
    static boolean raceOver = false;
    public HTRaceThread(String name) {
        super(name);
    }
    public void run() {
        for (int i = 1; i <= 100 && !raceOver; i++) {
            System.out.println(getName() + " : " + i + " meters");
            if (getName().equals("Hare") && i == 60) {
                try {
                    System.out.println("Hare is Sleeping...");
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
            if (i == 100) {
                raceOver = true;
                System.out.println(getName() + " Wins the Race!");
            }
        }
    }
}
public class HareTortoiseRace {
    public static void main(String[] args) {
        HTRaceThread hare = new HTRaceThread("Hare");
        HTRaceThread tortoise = new HTRaceThread("Tortoise");
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);
        hare.start();
        tortoise.start();
    }
}

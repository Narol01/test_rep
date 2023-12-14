package homework;

import java.util.Random;

public class Tarakan  implements Runnable{
    private static int count = 0;
    int tarakanNum;
    int distance;
    private long raceTime; // Время, затраченное на гонку

    public Tarakan(int distance) {
        this.tarakanNum = ++count;
        this.distance=distance;

    }

    @Override
    public void run() {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < distance; i++) {
            System.out.println("Tarakan " + tarakanNum +" in progress " + i);
            try {

                Thread.sleep(random.nextInt(2,6)); // положили поток спать

            } catch (InterruptedException e) {

                throw new RuntimeException(e);

            }
            long endTime = System.currentTimeMillis();
            raceTime = endTime - startTime;
            System.out.println("Tarakan #" + tarakanNum + " finished the race!");


        }

    }

    public long getRaceTime() {
        return raceTime;
    }
}

package practice;

public class MyTaskImplements implements Runnable{
    String name;// name of Task
    int  max;//how long counting

    public MyTaskImplements(String name, int max) {
        this.name = name;
        this.max = max;
    }

    @Override
    public void run() {
        System.out.println(name+" task started. ");
        //Counting from 0 to max
        for (int i = 0; i < max; i++) {
            System.out.println(name+ " count "+i);//every step program say info
                        try {

                Thread.sleep(3); // положили поток спать

            } catch (InterruptedException e) {

                throw new RuntimeException(e);

            }
        }
        System.out.println(name+" task finished.");
    }
}

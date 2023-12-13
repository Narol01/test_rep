package practice;

public class MultiThreadAppl {
    private static final int MAX = 10;

    public static void main(String[] args) {
        System.out.println("Main thread started");

//        MyTaskImplements task=new MyTaskImplements("Parallel task",MAX);
//        myTaskImplements.run();//это запуск второго thread
        MyTaskImplements myTaskImplements=new MyTaskImplements("Parallel task",MAX);

        Thread thread=new Thread(myTaskImplements);

        thread.start();//поток запустили

        for (int i = 0; i < MAX; i++) {
            System.out.println("Main count= " +i);
                        try {

                Thread.sleep(3); // положили поток спать

            } catch (InterruptedException e) {

                throw new RuntimeException(e);

            }
        }
        System.out.println("Main thread finished.");

    }
}

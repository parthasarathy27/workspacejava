package Thread;

public class mutithread {

    public static void main(String[] args) {
        single_thread t = new single_thread();
        second_thread t1 = new second_thread();
        third_thread t2 = new third_thread();
        t.start();
        t1.start();
        t2.start();

        //Anonymous class
        Thread t11 = new Thread() {
            @Override
            public void run() {
                System.out.println("Thread Checking");
            }
        };
        t11.start();
    }
}

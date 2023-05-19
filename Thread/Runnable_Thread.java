package Thread;

public class Runnable_Thread implements Runnable {

    public static void main(String[] args) {
        Runnable_Thread rt = new Runnable_Thread();
        Thread t = new Thread();

        Runnable r = new Runnable() {

            @Override
            public void run() {

                for(int i=0; i<10; i++){
                    System.out.println("Welcome "+i);
                }
            }
        };

        Thread ts = new Thread(r);
        t.start();
        ts.start();
    }

    @Override
    public void run() {

    }
}

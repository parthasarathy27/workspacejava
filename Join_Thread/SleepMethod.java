package Join_Thread;

public class SleepMethod {

    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {

                for (int i=0; i < 5; i++) {
                    System.out.println("Thread sleep method ==>  "+i);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println("Execption handled  "+ e.getMessage());
                    }
                }

                System.out.println("Thread went to daed state ");
            }
        };
        t.start();
    }
}

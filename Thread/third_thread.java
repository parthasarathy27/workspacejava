package Thread;

public class third_thread extends Thread {

        public void run() {
            for (int i = 0; i < 30; i++) {
                System.out.println("Third ===>" +i);
            }
        };
    }

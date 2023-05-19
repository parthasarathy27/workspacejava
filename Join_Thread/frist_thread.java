package Join_Thread;

public class frist_thread extends Thread {

        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("First ===>" +i);
            }
        };
    }

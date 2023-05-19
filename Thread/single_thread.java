package Thread;

public class single_thread extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("First ===>" +i);
        }
    };
}
package Join_Thread;

public class secound_thread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println("Second ===>" +i);
        }
    }
}

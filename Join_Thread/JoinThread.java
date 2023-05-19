package Join_Thread;

public class JoinThread {

    public static void main(String[] args) throws InterruptedException {

        frist_thread t = new frist_thread();
        secound_thread t1 = new secound_thread();
        third_thread t2 = new third_thread();
        t.start();
        t1.start();
        t.join();
        t2.start();
    }
}

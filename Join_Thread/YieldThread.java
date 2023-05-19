package Join_Thread;

public class YieldThread {

    public static void main(String[] args) throws Exception {
        frist_thread t = new frist_thread();
        secound_thread t1 = new secound_thread();
        third_thread t2 = new third_thread();
        t.start();
        Thread.yield();
        t1.start();
        Thread.yield();
        t2.start();
        System.out.println("working!!!");
    }
}

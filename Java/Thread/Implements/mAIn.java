package Java.Thread.Implements;

public class mAIn {
    public static void main(String[] args) {
        THREAD t = new THREAD(1);
        THREAD h = new THREAD(2);
        THREAD r = new THREAD(3);
        Thread s = new Thread(t);
        Thread q = new Thread(h);
        Thread a = new Thread(r);
        s.start();
        q.start();
        a.start();
    }
    

}

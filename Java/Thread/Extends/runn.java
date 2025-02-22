package Java.Thread.Extends;

public class runn {
    public static void main(String[] args) {
        thread t = new thread(1);
        thread h = new thread(2);
        thread r = new thread(3);

        t.start();
        h.start();
        r.start();
    }
    

}

package Java.Thread.Extends;

public class thread extends Thread {
    int a;
    thread(int a){
        this.a = a;
    }
    public void run(){
        for (int i = 1;i<=10;i++){
            System.out.println(a + " Count " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
}

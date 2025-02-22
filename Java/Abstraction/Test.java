package Java.Abstraction;

public class Test extends Abs {
    void print(String a){
        System.out.println(a);
    }
    Test(){
        Cla c = new Cla(this);
        c.dis();
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.print("Hey");
    }
}

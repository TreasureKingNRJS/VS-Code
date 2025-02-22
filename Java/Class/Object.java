package Java.Class;

public class Object {
    public static void main(String[] args) {
        MainClass a = new MainClass();
        MainClass b = new MainClass();

        a.a = 60;
        a.b = 70;
        b.a = 30;
        b.b = 12;

        System.out.println(a.a + " " + a.b + " " + b.a + " " + b.b);
        a.display();
        b.display();

        a.print(a.a,a.b);
        b.print(b.a,b.b);

        MainClass f = new MainClass();
        MainClass s = new MainClass();

        System.out.println("Enter 4 numbers");
        f.input();
        s.input();

        MainClass c = new MainClass();
        c.print(f.sum(f.a,f.b), s.sum(s.a, s.b));

    }
}

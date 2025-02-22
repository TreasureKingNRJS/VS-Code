package Java.Static;
//Static main funct only take static methods and variable
    
public class Static {
    int a = 10;
    static int b = 100;
    public static void main(String[] args) {
        Static n = new Static();
        Static h = new Static();
        n.hello();
        print("Bye");
        n.print("Come");
        n.b = 30;
        h.b = 50;//h.b and n.b is common . So latest value is data
        print(n.b,h.b);
        n.a = 43;
        h.a = 23;
        print(n.a,h.a);
        


    }
    void hello(){
        System.out.println("HELLO !");
    }
    static void print(String a){
        System.out.println(a);
    }
    static void print(int a){
        System.out.println(a);
    }
    static void print(String a , int b){
        System.out.println(a + b);
    }
    static void print(int a, int b){
        System.out.println(a + "\n" + b);
    }
}

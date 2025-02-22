package Java.Polymorphism.Overriding;

public class a {
    a(){
        System.out.println("a constr");
    }
    a(int a){
        System.out.println("argue a constr " + a);
    }
    int a ;
    static void print(){
        System.out.println("a");
    }
    void dis(b B){
        B.hello();
    }
}

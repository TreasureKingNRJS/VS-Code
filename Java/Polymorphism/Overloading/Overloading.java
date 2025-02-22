package Java.Polymorphism.Overloading;

public class Overloading {
    static void print(){
        System.out.println("Hello!");
    }
    static void print(int a){
        System.out.println(a);
    }static void print(String a){
        System.out.println(a);
    }
    static void print(String a , int b){
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        print();
        print("Hai");
        print("Poda ", 100);
        print(50);

    }
}

package Java.Polymorphism.Overriding;

public class b extends a{
    b(){ 
        System.out.println("b constr");
    }
    b(int a){
        super(10);//Super constr must be first
        System.out.println("argue b constr");
    }
    int a;
    static void print(){
        System.out.println("b");
    }
    void hello(){
        super.print();
        System.out.println("above from b");
    }
    void argue(int a){
        super.a = a;
        System.out.println(super.a);
    }
}

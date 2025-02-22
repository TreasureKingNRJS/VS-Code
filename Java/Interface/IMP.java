package Java.Interface;

public class IMP implements inter{
    public void print(String a ){
        System.out.println(a);    
    }
    IMP(){
        CLASS c = new CLASS(this);
        c.dis();
    }
    public static void main(String[] args) {
        IMP i = new IMP();
        i.print("Hello World");
    }
}

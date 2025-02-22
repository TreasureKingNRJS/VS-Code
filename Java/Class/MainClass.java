package Java.Class;
import java.util.Scanner;

public class MainClass{
    int a , b , c;
    void display(){
        System.out.println(a+"\n"+b);
    }
    int sum(int a,int b){
        return a+b;
    }
    void print(int a , int b){
        System.out.println("Sum = "+ sum(a , b));
    }
    void input(){
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
    }
    void hello(){
        System.out.println("Hello !");
    }
}
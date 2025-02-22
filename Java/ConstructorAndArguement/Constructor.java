package Java.ConstructorAndArguement;

public class Constructor {
    int a = 100 , b = 300;
    Constructor(int a, int b){
        this.a = a;//To get global same name var
        this.b = b;
    }
    void print(){
        System.out.println(a + "\n" + b);
    }
}

package Java.Function;

import java.util.Scanner;

public class Funct {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter two numbers\n");
            int a = s.nextInt();
            int b = s.nextInt();
            int pro=product(a,b);
            System.out.println("Product = " + pro);
        }

    }
    public static int product(int a ,int b){
        return a*b;
    }
}

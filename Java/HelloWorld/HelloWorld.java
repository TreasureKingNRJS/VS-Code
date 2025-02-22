package Java.HelloWorld;

import java.util.Scanner;

public class HelloWorld {
        public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int a = 15;
            System.out.println("Hello, World! " + a);

            System.out.println("Enter two numbers:");
            int b = s.nextInt();
            int c = s.nextInt();
            System.out.println(b + " + " + c + " = " + (b + c));
        }
    }
}

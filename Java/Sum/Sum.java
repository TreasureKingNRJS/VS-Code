package Java.Sum;

import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        System.out.println("Enter a number\n");
        try (Scanner s = new Scanner(System.in)) {
            int a = s.nextInt();
            int sum = 0;
            for(int i=1; i<=a;i++){
                sum = sum + i;
            }
            System.out.println("Result = "+sum);
        }
    }
}
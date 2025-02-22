package Java.If;

import java.util.Scanner;

public class NegPos {
    public static void main(String[] args) {
        System.out.println("Enter a number to check\n");
        try (Scanner a = new Scanner(System.in)) {
            int b = a.nextInt();
            if(b>0){
                System.out.println("Number is positive\n");
            }else if(b == 0){
                System.err.println("Number is zero(neutral)\n");
            }else{
                System.err.println("Number is negative\n");
            }
        }


    }
}

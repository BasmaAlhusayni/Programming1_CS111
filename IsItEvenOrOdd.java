// This program tells the user if the entered number is odd or even.

package isitevenorodd;

import java.util.Scanner;

public class IsItEvenOrOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eneter a Number: ");
        int Num = input.nextInt();
        if (Num % 2 == 0) {
            System.out.println("The Number Is Even");
        } else {
            System.out.println("The Number is Odd");
        }

    }
}

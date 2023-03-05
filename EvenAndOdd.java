// This program finds the sum of every odd and even number in the number the user entered.

package evenandodd;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eneter a Number: ");
        int number = input.nextInt();
        int[] array = new int[number];
        int sumodd = 0, sumeven = 0;
        for (int i = 1; i <= array.length; i++) {
            if (i % 2 == 0) {
                sumeven += i;
            } else {
                sumodd += i;
            }
        }
        System.out.println("The Sum of Odd Numbers Is " + sumodd + " And For Even Numbers Is " + sumeven);

    }
}

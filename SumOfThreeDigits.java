// This program gives the sum of three digits integer

package sumofthreedigits;

import java.util.Scanner;

public class SumOfThreeDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer that contains only three digits: ");
        int x = input.nextInt();
        int one = x % 10;
        x /= 10;
        int ten = x % 10;
        int hundred = x / 10;
        int sum = one + ten + hundred;
        System.out.println("The Sum of All Digits Combined is " + sum);
    }

}

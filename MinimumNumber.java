// This program finds the minimum number between ten numbers.
package minimumnumber;

import java.util.Scanner;

public class MinimumNumber {

    public static double min(double[] array1) {
        double min = array1[0];
        for (double i : array1) {
            if (i < min) {
                min = i;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array1 = new double[10];
        System.out.println("Enter " + array1.length + " Numbers:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.nextDouble();
        }
        System.out.println("The Minimum Is: " + min(array1));

    }

}

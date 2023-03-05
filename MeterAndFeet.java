// This program converts meter to feet or feet to meter.

package meterandfeet;

import java.util.Scanner;

public class MeterAndFeet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter option 1 or 2 (1 for meter to feet and 2 for feet to meter): ");
        int option = input.nextInt();
        if (option == 1) {
            System.out.print("Eneter meter value: ");
            double m = input.nextDouble();
            MeterToFeet(m);
        } else {
            System.out.print("Eneter Feet value: ");
            double f = input.nextDouble();
            FeetToMeter(f);
        }

    }

    public static void MeterToFeet(double m) {
        double feet = 3.279 * m;
        System.out.println("from meter to feet is " + feet);
    }

    public static void FeetToMeter(double f) {
        double meter = 0.305 * f;
        System.out.println("from feet to meter is " + meter);
    }
}

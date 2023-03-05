// This program calculates the area of a cylinder.

package calculateareacylinder;

import java.util.Scanner;

public class CalculateAreaCylinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        if (height <= 0 || radius <= 0) {
            System.out.println("height and radius should be positive");
            System.exit(0);
        }
        System.out.println("Area of cylinder: " + Math.round(CalculateAreaCylinder(height, radius) * 100) / 100.0);
    }

    public static double CalculateAreaCylinder(double height, double radius) {
        return (2 * Math.PI * Math.pow(radius, 2)) + (height * 2 * Math.PI * radius);
    }
}

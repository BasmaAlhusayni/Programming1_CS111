// This program calculate two numbers using + - * / operators.

package simplecalculator;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        double n1 = input.nextDouble();
        System.out.print("Enter The Second Number: ");
        double n2 = input.nextDouble();
        System.out.print("Choose an operator(+ - * /): ");
        String operation = input.next();
        double result;
        switch (operation) {
            case "+": {
                result = sum(n1, n2);
                System.out.println("The Addition of " + n1 + " and " + n2 + " Is: " + result);
                break;
            }
            case "-": {
                result = sub(n1, n2);
                System.out.println("The Subtraction of " + n1 + " and " + n2 + " Is: " + result);
                break;
            }
            case "*": {
                result = multiply(n1, n2);
                System.out.println("The Multiplication of " + n1 + " and " + n2 + " Is: " + result);
                break;
            }
            case "/": {
                result = divide(n1, n2);
                System.out.println("The Division of " + n1 + " and " + n2 + " Is: " + result);
                break;
            }
            default:
                System.out.println("You Didn't Enter an Operator");

        }

    }

    public static double sum(double n1, double n2) {
        return n1 + n2;
    }

    public static double sub(double n1, double n2) {
        return n1 - n2;
    }

    public static double multiply(double n1, double n2) {
        return n1 * n2;
    }

    public static double divide(double n1, double n2) {
        return n1 / n2;
    }
}

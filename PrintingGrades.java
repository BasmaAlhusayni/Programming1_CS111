// This program prints the letter of the entered grade.
package printinggrades;

import java.util.Scanner;

public class PrintingGrades {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enetr the grade: ");
        int Grade = input.nextInt();
        if (Grade >= 90) {
            System.out.println("A");
        } else if (Grade >= 80) {
            System.out.println("B");
        } else if (Grade >= 70) {
            System.out.println("C");
        } else if (Grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }

}

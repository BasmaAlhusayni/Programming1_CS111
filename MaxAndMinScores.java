// This program finds the highest and the lowest score among five students.

package maxandminscores;

import java.util.Scanner;

public class MaxAndMinScores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        int[] scores = new int[5];
        int maxScore = 0;
        int minScore = Integer.MAX_VALUE;
        String maxName = "";
        String minName = "";

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of student " + (i + 1) + " : ");
            names[i] = input.nextLine();
            System.out.print("Enter the score of student " + (i + 1) + " : ");
            scores[i] = input.nextInt();
            input.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxName = names[i];
            }
            if (scores[i] < minScore) {
                minScore = scores[i];
                minName = names[i];
            }
        }

        System.out.println("The student with the highest score is " + maxName + " with a score of " + maxScore);
        System.out.println("The student with the lowest score is " + minName + " with a score of " + minScore);
    }
}

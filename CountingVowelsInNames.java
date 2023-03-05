// This program calculates the number of vowels in all names.

package countingvowelsinnames;

import java.util.Scanner;

public class CountingVowelsInNames {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many names do you want to enter? ");
        int size = input.nextInt();

        String[] names = new String[size];
        System.out.println("Enter the names: ");
        for (int i = 0; i < size; i++) {
            names[i] = input.next();
        }

        int totalVowels = 0;
        for (int i = 0; i < size; i++) {
            totalVowels += countVowels(names[i]);
        }

        System.out.println("The total vowels is: " + totalVowels);
    }

    public static int countVowels(String name) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}

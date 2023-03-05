package countvowelsinaword;

import java.util.Scanner;

public class CountVowelsInAWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eneter a word: ");
        String word = input.nextLine();
        CountValue(word);
    }

    public static void CountValue(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'a': count++; break;
                case 'e': count++; break;
                case 'i': count++; break;
                case 'u': count++; break;
                case 'o': count++; break;
                
            }
            
//        int count = 0;
//        for (int i = 0; i<word.length(); i++)  {
//            if(word.charAt(i) == 'a') {
//            count++; }
//            else if (word.charAt(i) == 'e') {
//            count++;}
//        else if (word.charAt(i) == 'u'){
//            count++;} 
//        else if  (word.charAt(i) == 'i'){
//            count++;} 
//        else if (word.charAt(i) == 'o') {
//            count++;}
//        }
//        System.out.println("value is: " + count);
//    
        }
        System.out.println("The number of vowels is " + count);
    }
}

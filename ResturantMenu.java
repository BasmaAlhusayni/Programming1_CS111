//This program calculates the price of the choosen food and drink.

package resturantmenu;

import java.util.Scanner;

public class ResturantMenu {

    public static void main(String[] args) {

        String food;
        String drink;
        double price = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Choose Your Food (Pizza,Pasta,Burger,Hotdog): ");
        food = input.nextLine();
        System.out.print("Choose Your Drink (Pepsi,Orange Juice,Water): ");
        drink = input.nextLine();
        switch (food) {
            case "Pizza":
                price = 17.5;
                break;
            case "Pasta":
                price = 27;
                break;
            case "Burger":
                price = 22;
                break;
            default:
                price = 12;
                break;
        }
        double price2;
        switch (drink) {
            case "Pepsi":
                price2 = 2.5;
                break;
            case "Orange Juice":
                price2 = 1.5;
                break;
            default:
                price2 = 1;
                break;
        }
        double sum = price + price2;
        System.out.println("Your Total Price Is: " + sum);
    }

}

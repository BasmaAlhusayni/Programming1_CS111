// This program is about five clinets' stocks in three compenies(Apple, Microsoft, Google)

package investmentportfolio;

import java.util.Scanner;

public class InvestmentPortfolio {

    static Scanner input = new Scanner(System.in);
    static String[] clientNames = new String[5]; //stores the clients’ last names
    static String[] clientIDs = new String[5]; //stores the client ID
    //store the share of every stock for each client
    static int[] aaplShares = new int[5];
    static int[] msftShares = new int[5];
    static int[] googlShares = new int[5];
    static String[] stockSymbolsList = {"AAPL", "MSFT", "GOOGL"}; //single dimensional string array filled with the sympol of every stock
    static String[] stockNameList = {"Apple Inc.", "Microsoft", "Alphabet Inc."};//single dimensional string array filled with the name of every stock
    String symbol; //for the stock’s symbol
    String name; //for the stock’s name
    static float[] previousClosingPrice = {0.40f, 25.99f, 148f}; //single dimensional float array filled with the previous closing price of every stock
    static float[] currentPrice = {141.52f, 257.22f, 95.00f}; ////single dimensional float array filled with the previous closing price of every stock

    /* ********************************************** */
    public static void main(String[] args) {

        getClientsInfo(); //calling the method to let the user enter the information
        System.out.println("Welcome to Max Profit Stock Exchange");
        int serviceID;
        //using a do-while loop to let the menu repeat until the user enters zero
        do {
            System.out.println("To show equity summary, please enter 1.");
            System.out.println("To show stock portfilo, please enter 2.");
            System.out.println("To exit the program, please enter 0");
            serviceID = input.nextInt();
            //using switch to select the required service and store it in serviceID
            switch (serviceID) {
                case 1:
                    displayEquitySummary(stockSymbolsList, currentPrice); //calling this method to display clients portfilo summary
                    break;
                case 2:
                    displayStockStatus(stockSymbolsList, stockNameList, previousClosingPrice, currentPrice); //calling this method to display stock status in details
                    break;
                case 0:
                    System.out.println("Message: Program ended"); //before the program ends, this massege will appear
                    break;
                default:
                    System.out.println("Error: Invalid entry"); //if the user enters any other number, this massege will appear
                    break;
            }
        } while (serviceID != 0); //if the user enters zero, the program ends
    }

    /* ********************************************** */
    /**
     * method displayStockStatus displays the status of the stocks
     *
     * @param stockSymbolsList: String array
     * @param stockNameList: String array
     * @param previousClosingPrice: float array
     * @param currentPrice: float array
     */
    public static void displayStockStatus(String[] stockSymbolsList, String[] stockNameList,
            float[] previousClosingPrice, float[] currentPrice) {
        System.out.println("Stock status in details: ");
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.printf("%-16s%-18s%-30s%-21s%-14s\n", "Stock Name", "Stock Symbol", "Previous Closing Price", "Current Price", "Change Percent"); //using printf to display the first column of the table
        //using for loop to display stock status in details. and using printf to organize the values
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-16s%-18s%-30.2f%-21.2f%-14.2f\n", stockNameList[i],
                    stockSymbolsList[i], previousClosingPrice[i], currentPrice[i],
                    getChangePercent(currentPrice[i], previousClosingPrice[i]));
        }
        System.out.println("---------------------------------------------------------------------------------------------------");
    }

    /* ********************************************** */
    /**
     * method displayEquitySummary displays the value of share equity of the
     * stocks owned by each client
     *
     * @param stockSymbolsList
     * @param currentPrice
     */
    private static void displayEquitySummary(String[] stockSymbolsList, float[] currentPrice) {
        System.out.println("Equity summary:");
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "Name", "ID", "AAPL", "MSFT", "GOOGL"); //using printf to display the first column of the table
        //using for loop to display clients portfilo summary. and using printf to organize the values
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-15s%-15s%-15.2f%-15.2f%.2f\n", clientNames[i], clientIDs[i], aaplShares[i] * currentPrice[0], msftShares[i] * currentPrice[1], googlShares[i] * currentPrice[2]);
        }
        System.out.println("--------------------------------------------------------------------");
    }

    /* ********************************************** */
    /**
     * method getClientsInfo() fills the arrays: clientNames[], clientIDs[],
     * aaplShare[], msftShare[], and googlShare[] ,which contains information
     * about the clients and their share of each company
     */
    public static void getClientsInfo() {
        System.out.println("For each client, please enter the last name of the client followed by the ID(5 digits), the share of AAPL, MSFT and GOOGL:");
        //using for loop to let the user enters only 5 clients information
        for (int i = 0; i < 5; i++) {
            clientNames[i] = input.next();
            clientIDs[i] = input.next();
            aaplShares[i] = input.nextInt();
            msftShares[i] = input.nextInt();
            googlShares[i] = input.nextInt();
        }
    }


    /* ********************************************** */
    /**
     * method getChangePercent() calculates and returns the percentage changed
     * from previousClosingPrice to currentPrice
     *
     * @param currentPrice
     * @param previousClosingPrice
     * @return
     *
     */
    public static float getChangePercent(float currentPrice, float previousClosingPrice) {
        float ChangePercent = 0;
        ChangePercent = ((currentPrice) - (previousClosingPrice)) / (previousClosingPrice) * 100; //calculating the change precent
        return ChangePercent; //returning ChangePercent value when we call this method in main
    }
}

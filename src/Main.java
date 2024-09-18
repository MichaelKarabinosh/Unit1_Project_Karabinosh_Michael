

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        System.out.println("Welcome to the Tip Calculator (Version 1.1)");
        System.out.println("Do NOT type any symbols when using the calculator!");
        System.out.println("------------------------------------");

        Scanner s = new Scanner(System.in);
        System.out.print("Bill Amount: $");
        String initialBill = s.nextLine(); // The bill before any tip calculations
        double initialBillConv = Double.parseDouble(initialBill); // Converts the string into a double for parsing

        System.out.print("Percent Tip: ");
        String tipPercent = s.nextLine(); // The tip to be applied
        double tipPercentConv = Double.parseDouble(tipPercent)/100; // Whole number tip is divided by 100 for easier calculations

        System.out.print("Number of People Paying: ");
        String numPeople = s.nextLine();

        int numPeopleConv = Integer.parseInt(numPeople); // numPeople is initialized as an int
        double tipTotal = (tipPercentConv*initialBillConv); // The total tip is equal to the tip applied multiplied by the bill before any tip
        double finalBill = (initialBillConv+tipTotal); // The final bill is equal to the bill before any tip plus the tip
        double tipEachPerson = (tipTotal/numPeopleConv); // The amt each person pays in tips
        double eachPersonPay = (finalBill/numPeopleConv); // The total amt each person should pay

        System.out.println("----------------------------------------------");
        System.out.println("Total Bill Per Person: $" + String.format("%.2f", eachPersonPay)); // This stat is displayed first because it is the most useful
        System.out.println("----------------------------------------------");
        System.out.println("Tip Per Person: $" + String.format("%.2f", tipEachPerson));
        System.out.println("----------------------------------------------");
        System.out.println("Total Tip: $" + String.format("%.2f", tipTotal));
        System.out.println("----------------------------------------------");
        System.out.println("Final Bill: $" + String.format("%.2f", finalBill)); // This is displayed at the end because it is the final bill; makes the most sense
        System.out.println("----------------------------------------------");
        s.close(); // Stops the scanner s to prevent memory leak

    }
}
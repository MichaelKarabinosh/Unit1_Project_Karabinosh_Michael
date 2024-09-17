//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        System.out.println("Welcome to the Tip Calculator (Version 1.0)");
        System.out.println("------------------------------------");

        Scanner s = new Scanner(System.in);
        System.out.print("Bill Amount: $");
        String initialBill = s.nextLine();
        double initialBillConv = Double.parseDouble(initialBill);

        System.out.print("Percent Tip (Whole Number): ");
        String tipNum = s.nextLine();
        double tipNumConv = Double.parseDouble(tipNum)/100;

        System.out.print("Number of People Paying: ");
        String numPeople = s.nextLine();

        int numPeopleConv = Integer.parseInt(numPeople);
        double tipTotal = (tipNumConv*initialBillConv);
        double finalBill = (initialBillConv+tipTotal);
        double tipEachPerson = (tipTotal/numPeopleConv);
        double eachPersonPay = (finalBill/numPeopleConv);

        System.out.println("-----------------------");
        System.out.println("Total Bill Per Person: $" + String.format("%.2f", eachPersonPay));
        System.out.println("-----------------------");
        System.out.println("Tip Per Person: $" + String.format("%.2f", tipEachPerson));
        System.out.println("-----------------------");
        System.out.println("Total Tip: $" + String.format("%.2f", tipTotal));
        System.out.println("-----------------------");
        System.out.println("Final Bill: $" + String.format("%.2f", finalBill));
        s.close();

    }
}
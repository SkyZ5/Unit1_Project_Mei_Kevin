import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //INPUTS
        Scanner s = new Scanner(System.in);

        System.out.println("----------------------------------------------");
        System.out.println("This program only accepts numbers (No symbols)");
        System.out.println("----------------------------------------------");
        System.out.print("What is your total bill?: ");
        String bill = s.nextLine();
        double totalBill = Double.parseDouble(bill);
        System.out.print("What is your tip percentage?: ");
        String percentage = s.nextLine();
        double tipPercentage = Double.parseDouble(percentage);
        System.out.print("How many people are taking the bill?: ");
        String people = s.nextLine();
        double numberOfPeople = Double.parseDouble(people);
        System.out.println("----------------------------------------------");

        //CALCULATIONS
        tipPercentage /= 100;
        double totalTipAmount = totalBill * tipPercentage;
        double totalBillWithTip = totalBill + totalTipAmount;
        double tipPerPerson = totalTipAmount / numberOfPeople;
        double totalPerPerson = totalBillWithTip / numberOfPeople;

        //Rounding
        double totalTipAmountRounded = Math.round(totalTipAmount * 100.0) / 100.0;
        double totalBillWithTipRounded = Math.round(totalBillWithTip * 100.0) / 100.0;
        double tipPerPersonRounded = Math.round(tipPerPerson * 100.0) / 100.0;
        double totalPerPersonRounded = Math.round(totalPerPerson * 100.0) / 100.0;


        //Formating
        String totalTipAmountConverted = String.format("%.2f", totalTipAmountRounded);
        String totalBillWithTipConverted = String.format("%.2f", totalBillWithTipRounded);
        String tipPerPersonConverted = String.format("%.2f", tipPerPersonRounded);
        String totalPerPersonConverted = String.format("%.2f", totalPerPersonRounded);

        //OUTPUT
        System.out.println("Total amount tipped: $" + totalTipAmountConverted);
        System.out.println("Total bill including tip: $" + totalBillWithTipConverted);
        System.out.println("Tip per person: $" + tipPerPersonConverted);
        System.out.println("Total per Person: $" + totalPerPersonConverted);
        System.out.println("----------------------------------------------");

    }
}
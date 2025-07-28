// Tax slabs for general 0 to 1,80,000 No tax,1,80,001 to 
// 5,00,000 10%,5,00,001 to 8,00,000 20%, Above 8,00,000 30%.
//  Income tax slabs for Women 0 to 1,90,000 No tax, 1,90,001 to
//  5,00,000 10%, 5,00,001 to 8,00,000 20%, Above 8,00,000 30%.
//  Write if statements to achieve this. Make sure that you indent the 
// code well so that it is readable

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sci = new Scanner(System.in);

        System.out.print("Enter your gender (male/female): ");
        String gender = sci.nextLine();

        System.out.print("Enter your annual income: ");
        double income = sci.nextDouble();

        double tax = 0;

        if (gender.equalsIgnoreCase("male")) {
            if (income <= 180000) {
                tax = 0;
            } else if (income <= 500000) {
                tax = (income - 180000) * 0.10;
            } else if (income <= 800000) {
                tax = (500000 - 180000) * 0.10 + (income - 500000) * 0.20;
            } else {
                tax = (500000 - 180000) * 0.10 + (800000 - 500000) * 0.20 + (income - 800000) * 0.30;
            }
        } else if (gender.equalsIgnoreCase("female")) {
            if (income <= 190000) {
                tax = 0;
            } else if (income <= 500000) {
                tax = (income - 190000) * 0.10;
            } else if (income <= 800000) {
                tax = (500000 - 190000) * 0.10 + (income - 500000) * 0.20;
            } else {
                tax = (500000 - 190000) * 0.10 + (800000 - 500000) * 0.20 + (income - 800000) * 0.30;
            }
        } else {
            System.out.println("Invalid gender entered.");
            return; // Exit early if gender is invalid
        }

        System.out.println("Income Tax to be paid: ₹" + tax);
    }
}

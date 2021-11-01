// This Java program calculates user input and prompts the user for the loan amount, number of years and returns various interst rates and monthly payment options.

import java.util.Scanner;

public class LoansInterest {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
// Enter loan amount
System.out.print("Enter loan amount: ");
double loanAmount = input.nextDouble();
 
// Enter number of years
System.out.print("Enter number of years: ");
int numberOfYears = input.nextInt();
 
// Enter annual interest rate
double annualInterestRate = 5.0;
 
System.out.printf("%-18s%-18s%-18s\n", "Interest Rate",
    "Monthly Payment", "Total Payment");
 
while (annualInterestRate <= 8.0) {
   double monthlyInterestRate = annualInterestRate / 1200;
 
double monthlyPayment = loanAmount
     * monthlyInterestRate
     / (1 - 1 / Math.pow(1 + monthlyInterestRate,
       numberOfYears * 12));

double totalPayment = monthlyPayment * numberOfYears * 12;
 
// Display results
System.out.printf("%-18.3f%-18.2f%-18.2f\n", annualInterestRate,
     monthlyPayment, totalPayment);
   
   annualInterestRate = annualInterestRate + 1.0 / 8;  }
 }
}

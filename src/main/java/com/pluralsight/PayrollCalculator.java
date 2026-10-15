package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your total hours worked this pay period: ");
        float hoursWorked = scanner.nextFloat();

        System.out.println("Enter your hourly pay rate: ");
        float payRate = scanner.nextFloat();

        float grossPay = hoursWorked * payRate;
        System.out.println("Hello, " + name + ". Your gross pay for this period is $" + grossPay + ".");
    }
}

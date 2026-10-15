package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your total hours worked this pay period: ");
        double hoursWorked = scanner.nextFloat();

        System.out.println("Enter your hourly pay rate: ");
        double payRate = scanner.nextFloat();

        double grossPay;

        if (hoursWorked > 40.0) {
            double overTimeHours = hoursWorked - 40.0;
            double overTimePayRate = payRate * 1.5;
            double grossOvertime = overTimeHours * overTimePayRate;
            double basePay = 40.0 * payRate;
            grossPay = basePay + grossOvertime;
            System.out.printf("Hello %s. Your gross pay for this period is $%.2f. $%.2f of that amount is overtime pay!", name, grossPay, grossOvertime);
        } else {
            grossPay = hoursWorked * payRate;
            System.out.printf("Hello %s. Your gross pay for this period is $%.2f", name, grossPay);
        }


        scanner.close();
    }
}

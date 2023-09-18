package br.com.exercises.sequential.payment;

import java.util.Scanner;

public class Payment {
    public static void main(String[] args) {
        String name;
        double valuePerHour, payPerHour;
        int  workedHours;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hours worked calculator\n");
        System.out.println("Type your name");
        name = scanner.nextLine();

        System.out.println("Type value peur hour: ");
        valuePerHour = scanner.nextDouble();

        System.out.println("Type your hours worked ");
        workedHours = scanner.nextInt();

        payPerHour = valuePerHour * workedHours;

        System.out.printf("Payment to %s must be %.2f\n", name, payPerHour);
        scanner.close();
    }

}

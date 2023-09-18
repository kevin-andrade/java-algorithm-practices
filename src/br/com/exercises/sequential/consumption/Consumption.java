package br.com.exercises.sequential.consumption;

import java.util.Scanner;

public class Consumption {
    public static void main(String[] args) {
        double travelledDistance;
        double spentFuel, averageConsumption;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Consumption calculator (in km)");
        System.out.println("Type your travelled distance: ");
        travelledDistance = scanner.nextDouble();

        System.out.println("Type your spent fuel: ");
        spentFuel = scanner.nextDouble();

        averageConsumption = travelledDistance / spentFuel;

        System.out.printf("Average consumption is %.3f", averageConsumption);
        scanner.close();
    }
}

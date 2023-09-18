package br.com.exercises.sequential.bhaskara;

/* "Baskara" problem
Write a program to read the three coefficients of a quadratic equation. using the formula
of Baskara, calculate and display the values ​​of the roots x1 and x2 of the equation with four decimal places,
as per example. If the equation has no real roots, display a message */

import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        double coefficientA, coefficientB, coefficientC;
        double x1, x2, delta;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Baskara formula calculator");

        System.out.println("Coefficient A: ");
        coefficientA = scanner.nextDouble();
        System.out.println("Coefficient B: ");
        coefficientB = scanner.nextDouble();
        System.out.println("Coefficient C: ");
        coefficientC = scanner.nextDouble();

        delta = (Math.pow(coefficientB, 2)) - (4 * coefficientA * coefficientC);

        if (!(coefficientA == 0 || delta < 0)) {
            x1 = (-coefficientB + Math.sqrt(delta)) / (2 * coefficientA);
            x2 = (-coefficientB - Math.sqrt(delta)) / (2 * coefficientA);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("This equation has no real roots");
        }

        scanner.close();
    }
}

package br.com.exercises.sequential.measurements;

import java.util.Scanner;

public class Measurements {
    public static void main(String[] args) {
        double measureA, measureB, measureC;
        double squareArea, triangleArea, trapezeArea;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three measures (A, B and C)");
        System.out.println("Enter the measure A: ");
        measureA = scanner.nextDouble();

        System.out.println("Enter the measure B: ");
        measureB = scanner.nextDouble();

        System.out.println("Enter the measure C: ");
        measureC = scanner.nextDouble();

        squareArea = Math.pow(measureA, 2);
        triangleArea = (measureA * measureB) / 2;
        trapezeArea = (measureA + measureB) * measureC / 2;

        System.out.println("Square area = " + squareArea);
        System.out.println("Triangle area = " + triangleArea);
        System.out.println("Trapeze area = " + trapezeArea);
    }
}

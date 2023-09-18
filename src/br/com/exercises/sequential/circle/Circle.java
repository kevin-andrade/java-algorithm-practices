package br.com.exercises.sequential.circle;

import java.util.Scanner;

public class Circle {

    public static double areaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radiusCircle;

        System.out.println("Enter the value of the radius of the circle: ");
        radiusCircle = scanner.nextDouble();

        System.out.println("AREA = " + areaOfCircle(radiusCircle));

        scanner.close();
    }

}

package br.com.exercises.sequential.duration;

import java.util.Scanner;

public class Duration {
    public static void main(String[] args) {
        int hours, minutes, seconds, rest, duration;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Seconds calculator");
        System.out.println("Enter duration in seconds: ");
        duration = scanner.nextInt();

        hours = duration / 3600;
        rest = duration % 3600;

        minutes = rest / 60;
        seconds = rest % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}

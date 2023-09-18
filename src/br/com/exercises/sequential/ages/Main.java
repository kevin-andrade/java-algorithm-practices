package br.com.exercises.sequential.ages;

import static br.com.exercises.sequential.ages.Age.calculateAverageAge;

public class Main {
    public static void main(String[] args) {
        Age age1 = new Age("Keven Andrade", 19);

        Age age2 = new Age("Giselle", 20);

        Age[] ages = {age1, age2};
        double middleAge = calculateAverageAge(ages);

        System.out.println("The average age of " + age1.getName() + " and " + age2.getName() + " is " + middleAge + " is years old");
    }

}

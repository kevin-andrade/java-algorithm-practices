package br.com.exercises.sequential.underthree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UnderThree {
    public static void main(String[] args) {
        int lowerValue;
        int qtd = 3;
        List<Integer> numbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        
        for (Integer i = 0; i < qtd; i++) {
            System.out.println("Enter the number " + (i + 1) + ":");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        lowerValue = findSmallestValue(numbers);
        System.out.println(lowerValue);

    }

    public static int findSmallestValue(List<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("List empty");
        }

        int smaller = list.get(0);
        for (int num : list){
            if (num < smaller) {
                smaller = num;
            }
        }
        return smaller;

    }

}

package com.chaka.learn;

import java.util.Scanner;

public class LogicalOperators {

    public static void main(String args[]) {

        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Old Are You?");
        age = scanner.nextInt();
            //(age && || && ||
        if (age >= 18 && age < 60) {

            System.out.println("You Can Enter.");
        } else {

            System.out.println("You Can Not Enter!");
        }
    }
}

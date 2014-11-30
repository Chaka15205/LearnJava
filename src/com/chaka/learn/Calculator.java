package com.chaka.learn;

import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        double fnum, snum, answer;

        System.out.println("Enter First Number: ");
        fnum = scanner.nextDouble();

        System.out.println("Enter Second Number: ");
        snum = scanner.nextDouble();

        answer = fnum + snum;
        System.out.println(answer);
    }
}

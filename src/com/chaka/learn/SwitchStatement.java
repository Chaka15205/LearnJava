package com.chaka.learn;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String args[]) {

        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age: ");
        age = scanner.nextInt();

        switch (age) {

            case 1:
                System.out.println("You Can Crawl");
                break;
            case 2:
                System.out.println("You Can Talk");
                break;
            case 3:
                System.out.println("You Can Get In Trouble");
                break;
            default:
                System.out.println("I don't know what you do");
                break;
        }
    }
}
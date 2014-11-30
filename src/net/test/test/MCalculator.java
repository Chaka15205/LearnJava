package net.test.test;

import java.util.Scanner;

public class MCalculator {

    static int p1;
    static int p2;
    static int input;
    /* 1 = p1passgo
       2 = p2passgo
       3 = p1rent
       4 = p2rent
       5 = p1tax
       6 = p2tax
     */
    static int rent;
    static float tax;

    public static void init() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Players Cash!");
        p1 = scanner.nextInt();
        System.out.println(p1);

        System.out.println("Enter Second Players Cash!");
        p2 = scanner.nextInt();
        System.out.println(p2);

        System.out.println("Enter Operator");
        input = scanner.nextInt();
        System.out.println(input);

        if (input == 1) {

            p1 = p1 + 200;
            System.out.println(p1);
        } else if (input == 2) {

            p2 = p2 + 200;
            System.out.println(p2);
        } else if (input == 3) {

            System.out.println("Enter Rent Ammount");
            rent = scanner.nextInt();
            System.out.println("Rent is: " + rent);
            p1 = p1 - rent;
            System.out.println("Player 1s Cash: " + p1);
        } else if (input == 4) {

            System.out.println("Enter Rent Ammount");
            rent = scanner.nextInt();
            System.out.println("Rent is: " + rent);
            p2 = p2 - rent;
            System.out.println("Player 2s Cash: " + p2);
        } else if (input == 5) {

            System.out.println("Enter Tax Ammount");
        } else if (input == 7) {

        } else if (input == 8) {

        } else if (input == 9) {

        } else if (input == 10) {


        }
    }
}

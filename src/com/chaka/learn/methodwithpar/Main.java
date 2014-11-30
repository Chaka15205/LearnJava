package com.chaka.learn.methodwithpar;

import com.chaka.learn.methodwithpar.Method;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        Method method = new Method();

        System.out.println("Enter Your Name: ");
        String name = scanner.nextLine();

        method.simpleMessage(name);
    }
}

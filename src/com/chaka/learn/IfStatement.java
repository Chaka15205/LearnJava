package com.chaka.learn;

public class IfStatement {

    public static void main(String args[]) {

        int test = 6;

        //=  Equal
        //!= Not Equal
        //<= >= < >
        if (test == 9) {

            System.out.println("if");
        } else {

            System.out.println("else");
        }

        System.out.println("----------");

        if (test < 9) {

            System.out.println("if");
        } else {

            System.out.println("else");
        }
    }
}

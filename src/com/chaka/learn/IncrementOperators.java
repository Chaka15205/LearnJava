package com.chaka.learn;

public class IncrementOperators {

    public static void main(String args[]) {

        int tuna = 5;
        int bass = 18;

        //Adds one
        ++tuna;
        System.out.println(tuna); //= 6  Can add ++   println(++tuna);

        //Post Increment
        System.out.println(tuna++);//6  //Adds 1 after called
        System.out.println(tuna);//7

        //= Value + New Value
        tuna = tuna + 5;
        tuna += 5;  // -, *
    }
}

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */

package org.example;

import java.util.Scanner;

public class SelfCheckout {

    static public void main (String[] args){

        Scanner input = new Scanner(System.in);

        int[] arrNumber = new int[3];
        float[] arrPrice = new float[3];

        float totalPrice = 0;

        for (int i = 0; i<3; i++){
            String helper;

            System.out.printf("Enter the price of item %d: ", i+1);
            helper = input.next();
            arrPrice[i]= Float.parseFloat(helper);

            System.out.printf("Enter the quantity of item %d: ", i+1);
            helper = input.next();
            arrNumber[i]= Integer.parseInt(helper);

            totalPrice += (arrNumber[i]*arrPrice[i]);
        }

        double tax = 0.055*totalPrice;

        System.out.printf("Subtotal: $%.2f\n", totalPrice);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f", totalPrice+tax);



    }
}

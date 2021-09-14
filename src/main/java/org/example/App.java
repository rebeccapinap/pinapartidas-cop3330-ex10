package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

// Libraries
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int i;
        double singlePrice = 0;
        double singleQuantity = 0;
        double subtotal = 0;
        double tax;
        double total;

        // Calculates subtotal, tax, and total for 3 items
        for (i = 1; i <= 3; i++)
        {
            System.out.format("Enter the price of item %d: ", i);
            singlePrice = input.nextDouble();
            System.out.format("Enter the quantity of item %d: ", i);
            singleQuantity = input.nextDouble();
            subtotal += (singlePrice * singleQuantity);
        }

        tax = subtotal * 0.055;
        total = subtotal + tax;

        System.out.format("Subtotal: $%.2f \n", subtotal);
        System.out.format("Tax: $%.2f \n", tax);
        System.out.format("Total: $%.2f \n", total);
    }
}

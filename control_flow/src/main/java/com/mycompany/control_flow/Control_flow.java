/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.control_flow;

import java.util.*;

/**
 *
 * @author rufat
 */
public class Control_flow {

    public static void main(String[] args) {

        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("You are an admin.");
                break;
            case "moderator":
                System.out.println("You're a moderator.");
            default: 
                System.out.println("You're a guest.");
        }
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Number: ");
            int number = 0;
            try {
                number = scanner.nextInt();
                if (number <= 0) {
                    throw new IllegalArgumentException("Number should be positive.");
                }
            } catch (InputMismatchException e) {
                throw new IllegalArgumentException("Invalid input.");
            }
            
            if (number%3==0 && number%5==0) 
            {
                System.out.println("FizzBuzz");
            }
            else if (number%3==0 && number%5!=0)
            {
                System.out.println("Fizz");
            }
            else if (number%3!= 0 && number%5==0)
            {
                System.out.println("Buzz");
            }
            else    
            {
                System.out.println(number);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//
//        while (!input.equals("quit")) {
//            System.out.print("Input:");
//            input = scanner.next().toLowerCase();
//            if (!input.equals("quit")) {
//                System.out.println (input);
//
//            }
//        }

    }
}

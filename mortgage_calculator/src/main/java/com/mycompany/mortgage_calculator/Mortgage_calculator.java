/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mortgage_calculator;

import java.util.*;
import java.text.DecimalFormat;

/**
 *
 * @author rufat
 */
public class Mortgage_calculator {

    public static void main(String[] args) {
        System.out.println("Mortgage calculator.");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Principal: ");
            int principal = 0;
            while(true)
            {
            try {
                principal = scanner.nextInt();
                if (principal <= 0) {
                    System.out.println("Principal must be positive value.");
                }
                else
                {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer");
                scanner.nextLine();
            }
            }

            System.out.print("Interest rate: ");
            double interest_rate = 0;
            while(true)
            {
            try {
                interest_rate = scanner.nextDouble();
                if (interest_rate <= 0) {
                    System.out.println("Rate should be bigger than 0.");
                }
                else    
                {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid double rate.");
                scanner.nextLine();
            }
            }
            interest_rate = (interest_rate / 12) / 100;

            System.out.print("Period (Years): ");
            int period = 0;
            while (true) {
                try {

                    period = scanner.nextInt();
                    if (period <= 0) {
                        System.out.println("Period should be bigger than 0.");
                    } else {
                        break;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid period.");
                    scanner.nextLine();
                }

            }
            period = period * 12;

            double pow_up = interest_rate * Math.pow(1 + interest_rate, period);
            double pow_down = Math.pow(1 + interest_rate, period) - 1;

            double mortgage = principal * ((pow_up) / (pow_down));

            DecimalFormat decimalformat = new DecimalFormat("0.00");

            System.out.println("Mortgage: " + decimalformat.format(mortgage));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

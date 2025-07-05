package com.automate;

public class numbers {

    public static void main(String[] args) {



        int[] numbers = {1, 5, 8, 12, 3, 9, 20};

        for (int num : numbers) { // Using enhanced for loop
            // Check if the number is even
            if (num % 2 == 0) {
                System.out.println(num + " is an even number.");
            } else {
                System.out.println(num + " is an odd number.");
            }

            if (num > 10) {
                System.out.println("    And " + num + " is also greater than 10.");
            }
            System.out.println("--------------------");
        }
        }

    }


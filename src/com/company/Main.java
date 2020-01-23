package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input;
        int total = 0;
        int exit = -1;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\nType any integer: ");
            input = in.nextLine();

            try{
                exit = Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.out.println("Just integers allowed ");
                continue;
            }

            for (char c : input.toCharArray()) {
                total += Integer.parseInt(String.valueOf(c));
            }

            System.out.println("The sum is: " + total);
            total = 0;
        } while (exit != 0);
    }
}

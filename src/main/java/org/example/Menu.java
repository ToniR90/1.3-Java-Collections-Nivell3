package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static int showMenu(){
        int option = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(     "Select an option!:\n\n" +
                                    "1. Insert person\n" +
                                    "2. Show people sorted by name (A-Z)\n" +
                                    "3. Show people sorted by name (Z-A)\n" +
                                    "4. Show people sorted by surename (A-Z)\n" +
                                    "5. Show people sorted by surename (Z-A)\n" +
                                    "6. Show people sorted by DNI (1-9)\n" +
                                    "7. Show people sorted by DNI (9-1)\n" +
                                    "0. Exit");

            try{
                option = sc.nextInt();
                if(option < 0 || option > 7){
                    System.out.println("❌ Enter an integer between 0 - 7");
                }
            }catch(InputMismatchException e){
                option = -1;
                sc.nextLine(); // buffer cleaner
                System.out.println("❌ Invalid input, enter a valid integer");
            }
        }while(option < 0 || option > 7);
        return option;
    }
}

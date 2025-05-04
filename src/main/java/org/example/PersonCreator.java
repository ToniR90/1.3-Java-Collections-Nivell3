package org.example;

import java.util.Scanner;

public class PersonCreator {

    public static Person createPerson(){
        Scanner sc = new Scanner(System.in);
        String name;
        String surname;
        String dni;

        do{
            System.out.println("Insert the name");
            name = sc.nextLine().trim();
        }while(name.isEmpty());
        do{
            System.out.println("Insert the surname");
            surname = sc.nextLine().trim();
        }while(surname.isEmpty());
        do{
            System.out.println("Insert the dni");
            dni = sc.nextLine().trim();
        }while(dni.isEmpty());
        return new Person(name , surname , dni);
    }
}

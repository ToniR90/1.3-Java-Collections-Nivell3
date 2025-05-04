package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String csvPath = "list.csv";

        List<Person> people = CsvHandler.readFromCsv(csvPath);
        PeopleManagement management = new PeopleManagement(people);
        Scanner sc = new Scanner(System.in);

        int option;

        System.out.println("Welcome to the CSV project!\n");

        do{
            option = Menu.showMenu();

            switch (option){
                case 1:
                    Person newPerson = PersonCreator.createPerson();
                    management.addPerson(newPerson);
                    break;

                case 2:
                    PeopleSorter.sortByNameAsc(management.getPeople());
                    showPeople(management.getPeople());
                    break;

                case 3:
                    PeopleSorter.sortByNameDesc((management.getPeople()));
                    showPeople(management.getPeople());
                    break;

                case 4:
                    PeopleSorter.sortBySurnameAsc(management.getPeople());
                    showPeople(management.getPeople());
                    break;

                case 5:
                    PeopleSorter.sortBySurnameDesc(management.getPeople());
                    showPeople(management.getPeople());
                    break;

                case 6:
                    PeopleSorter.sortByDniAsc(management.getPeople());
                    showPeople(management.getPeople());
                    break;

                case 7:
                    PeopleSorter.sortByDniDesc(management.getPeople());
                    showPeople(management.getPeople());
                    break;

                case 0:
                    CsvHandler.writeToCsv(csvPath, management.getPeople());
                    System.out.println("💾 People saved to CSV. Bye!");
                    break;

                default:
                    System.out.println("❌ Unknown option. Try again.");

            }
        }while(option != 0);

        sc.close();
    }

    public static void showPeople(List<Person> people){
        if(people.isEmpty()){
            System.out.println("⚠️  No people to display.");
        } else {
            System.out.printf("%-15s %-25s %-10s\n", "Name", "Surname", "DNI");
            System.out.println("_________________________________________________");
            for (Person person : people){
                System.out.println(person);
            }
        }
    }
}
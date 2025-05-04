package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvHandler {

    public static List<Person> readFromCsv(String path){
        List<Person> people = new ArrayList<>();

        try(BufferedReader read = new BufferedReader((new FileReader((path))))) {
            String line;

            while((line = read.readLine()) != null) {
                String [] values = line.split(",");

                if(values.length == 3) {
                    String name = values[0].trim();
                    String surname = values[1].trim();
                    String dni = values[2].trim();

                    people.add(new Person(name , surname , dni));
                }
            }
        } catch (IOException e){
            System.out.println("⚠️ CSV file not found or error reading it.");
        }
        return people;
    }

    public static void writeToCsv(String path , List<Person> people) {
        try(BufferedWriter writer = new BufferedWriter((new FileWriter(path)))){
            for (Person person : people){
                writer.write(String.format(("€s , €s , €s") , person.getName() , person.getSurname() , person.getDni()));
                writer.newLine();
            }

        }catch(IOException e) {
            System.out.println("❌ Error writing to CSV file.");
        }
    }
}

package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PeopleSorter {

    public static void sortByNameAsc(List<Person> people){
        Collections.sort(people , new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.getName().compareTo(person2.getName());
            }
        });
    }

    public static void sortByNameDesc(List<Person> people){
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person2.getName().compareTo(person1.getName());
            }
        });
    }

    public static void sortBySurnameAsc(List<Person> people){
        Collections.sort(people , new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.getSurname().compareTo(person2.getSurname());
            }
        });
    }

    public static void sortBySurnameDesc(List<Person> people){
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person2.getSurname().compareTo(person1.getSurname());
            }
        });
    }

    public static void sortByDniAsc(List<Person> people){
        Collections.sort(people , new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.getDni().compareTo(person2.getDni());
            }
        });
    }

    public static void sortByDniDesc(List<Person> people){
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person2.getDni().compareTo(person1.getDni());
            }
        });
    }
}

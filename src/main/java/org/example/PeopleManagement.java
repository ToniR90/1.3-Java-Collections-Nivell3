package org.example;

import java.util.List;
import java.util.Scanner;

public class PeopleManagement {

    private List<Person> people;

    public PeopleManagement(List<Person> person) {
        this.people = person;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void addPerson(Person person){
        people.add(person);
    }
}

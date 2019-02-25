package com.oneso.dao;

import com.oneso.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoSimple implements PersonDao {

    private List<Person> personList = new ArrayList<>();

    public Person findPerson(String firstName, String lastName) {
        for(Person temp : personList) {
            if(temp.getFirstName().equals(firstName) && temp.getLastName().equals(lastName)) {
                return temp;
            }
        }

        return new Person(firstName, lastName);
    }

    public Person newPerson(String firstName, String lastName) {
        personList.add(new Person(firstName, lastName));
        return new Person(firstName, lastName);
    }
}

package org.example;

import java.util.ArrayList;

public class SearchService implements Searchable {

    @Override
    public ArrayList<Person> searchByPerson(String personName, ArrayList<Person> personList) {
        ArrayList<Person> searchResult = new ArrayList<>();
        for (Person person : personList) {
            if (person.getName().equals(personName)) {
                searchResult.add(person);
            }
        }
        return searchResult;
    }
}
package org.example;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@ToString
public class Company {
    private ArrayList<Person> personList;
    private SearchService searchService;

    public Company(ArrayList<Person> personList) {
        this.personList = personList;
        this.searchService = new SearchService();
    }



    public Company() {
        this.searchService = new SearchService();
        this.personList = new ArrayList<>();
        personList.add(new Person("Иван Александров",
                "04.02.1987",
                1, new JobTitle("Accountant")));

        personList.add(new Person("Алексей Александров",
                "04.02.1987",
                2, new JobTitle("Engineer")));

        personList.add(new Person("Михаил Александров",
                "04.02.1987",
                3, new JobTitle("Accountant")));

        personList.add(new Contractor("Михаил Михаилов",
                "04.02.1987",
                4, new JobTitle("Gardener"),
                "05.02.2020",
                "Order #12"));
    }

    public ArrayList<Person> searchByPerson(String Name) {
        return searchService.searchByPerson(Name, personList);
    }
}

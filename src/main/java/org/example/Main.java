package org.example;

public class Main {
    public static void main(String[] args) {

        Company company = new Company();
        System.out.println(company);

        System.out.println(company.searchByPerson("Иван Александров"));
        System.out.println(company.searchByPerson("Михаил Александров"));
        System.out.println(company.searchByPerson("Михаил Михаилов"));

    }
}
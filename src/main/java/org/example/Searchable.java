package org.example;
import java.util.ArrayList;

/**
 * Принцип разделения интерфейса
 */
public interface Searchable {
    ArrayList<Person> searchByPerson(String authorName, ArrayList<Person> bookList);

}
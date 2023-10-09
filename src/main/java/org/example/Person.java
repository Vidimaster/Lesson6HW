package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * Принцип единственной ответственности -> Single Responsibility Principle
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    protected String Name;
    protected String DateOfBirth;
    protected int ID;
    protected JobTitle jobTitle;
}

package org.example;
import lombok.*;
@AllArgsConstructor
@Setter
@Getter
@ToString
/**
 * Принцип подстановки Барбары Лисков
 */
public class Employee extends Person{
    private String DateStartOfEmployment;
    private String EmploymentContract;
}

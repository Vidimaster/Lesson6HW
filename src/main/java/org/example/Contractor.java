package org.example;
import lombok.*;
@AllArgsConstructor
@Setter
@Getter
@ToString
/**
 * Принцип подстановки Барбары Лисков
 */
public class Contractor extends Person{


    private String DateStartOfContract;
    private String Contract;

    public Contractor(String Name, String DateOfBirth, int ID, JobTitle jobTitle, String dateStartOfContract, String contract) {
        super(Name, DateOfBirth, ID, jobTitle);
        DateStartOfContract = dateStartOfContract;
        Contract = contract;
    }




}

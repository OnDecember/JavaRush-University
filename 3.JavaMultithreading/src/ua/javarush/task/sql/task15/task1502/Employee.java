package ua.javarush.task.sql.task15.task1502;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class Employee extends Person {

    private String company;
}

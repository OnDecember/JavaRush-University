package ua.javarush.task.sql.task15.task1502;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class Client extends Person {

    private String bank;
}

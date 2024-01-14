package ua.javarush.task.sql.task15.task1501;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "client")
public class Client extends Person {

    @Column(nullable = false)
    private String bank;
}

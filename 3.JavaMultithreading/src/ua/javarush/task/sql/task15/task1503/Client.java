package ua.javarush.task.sql.task15.task1503;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "client")
@PrimaryKeyJoinColumn(name = "person_id")
public class Client extends  Person {

    @Column(nullable = false)
    private String bank;
}

package ua.javarush.task.sql.task15.task1504;

import jakarta.persistence.*;

@Entity
@Table(name = "perosn")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person {

    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer age;
}

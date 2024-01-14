package ua.javarush.task.sql.task15.task1501;

import jakarta.persistence.*;

@Entity
@Table(name = "person")
@MappedSuperclass
public class Person {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer age;
}

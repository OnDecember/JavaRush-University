package ua.javarush.task.sql.task15.task1502;

import jakarta.persistence.*;

@Entity
@Table(name = "person")
@DiscriminatorColumn(name = "person_type", discriminatorType = DiscriminatorType.INTEGER)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer age;
}

package ua.javarush.task.sql.task12.task1201;

/*
Створюємо Entity з класу
*/

import jakarta.persistence.*;

@Entity
@Table(name = "library_table")
public class Library {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "status")
    @Enumerated(value = EnumType.ORDINAL)
    private PublicationStatus status;

    @Column(name = "publicationName")
    private String publicationName;

    @Column(name = "isbn")
    private String isbn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PublicationStatus getStatus() {
        return status;
    }

    public void setStatus(PublicationStatus status) {
        this.status = status;
    }

    public String getPublicationName() {
        return publicationName;
    }

    public void setPublicationName(String publicationName) {
        this.publicationName = publicationName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}

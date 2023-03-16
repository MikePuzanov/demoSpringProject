package spring.myProject.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Books")
public class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "author", nullable = false)
    private String author;
    @Column(name = "description")
    private String description;
    @Column(name = "isFree")
    private boolean isFree;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "bookId", orphanRemoval = true)
    private List<Order> orders = new ArrayList<>();

    public Book(Long id, String name, String author, String description, boolean isFree) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.description = description;
        this.isFree = isFree;
    }

    public Book() {

    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

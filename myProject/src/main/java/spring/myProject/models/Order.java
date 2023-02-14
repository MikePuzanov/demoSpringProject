package spring.myProject.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "customerId")
    public int customerId;

    @Column(name = "adminId")
    public int adminId;

    @Column(name = "bookId")
    public int bookId;

    @Column(name = "isDone")
    public boolean isDone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public Order() {
    }

    public Order(int id, int customerId, int adminId, int bookId, boolean isDone) {
        this.id = id;
        this.customerId = customerId;
        this.adminId = adminId;
        this.bookId = bookId;
        this.isDone = isDone;
    }
}

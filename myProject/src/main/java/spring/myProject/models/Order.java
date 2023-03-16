package spring.myProject.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId")
    private User customerId;

    @Column(name = "adminId", nullable = false)
    private Long adminId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bookId")
    private Book bookId;

    @Column(name = "isDone")
    private boolean isDone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCustomerId() {
        return customerId.getId();
    }

    public void setCustomerId(User customerId) {
        this.customerId = customerId;
    }

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public long getBookId() {
        return bookId.getId();
    }

    public void setBookId(Book bookId) {
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

    public Order(int id, User customerId, Long adminId, Book bookId, boolean isDone) {
        this.id = id;
        this.customerId = customerId;
        this.adminId = adminId;
        this.bookId = bookId;
        this.isDone = isDone;
    }
}

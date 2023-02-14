package spring.myProject.dto;

public class BookDTO {
    private String name;
    private String author;
    private String description;

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

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }
}

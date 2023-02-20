package spring.myProject.services;

import org.springframework.stereotype.Service;
import spring.myProject.models.Book;
import spring.myProject.repositories.BookRepositoryImpl;

import java.util.List;

@Service
public class BookService {
    private final BookRepositoryImpl bookRepository;

    public BookService(BookRepositoryImpl bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book) {

        var s = bookRepository.save(book);
    }

    public Book getBookById(int id) {

        return bookRepository.findById(id).get();
    }

    public List<Book> getBooksByName(String name) {
        return bookRepository.findBooksByName(name);
    }

    public List<Book> getBooksByAuthor(String author) {

        return bookRepository.findBooksByAuthor(author);
    }

    public void deleteBook(int id) {

        bookRepository.deleteById(id);
    }

    public Book editBook(Book newBook) {
        return newBook;
    }
}

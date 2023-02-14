package spring.myProject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import spring.myProject.dto.BookDTO;
import spring.myProject.models.Book;
import spring.myProject.services.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {
    private final BookService bookService;
    private final ModelMapper modelMapper;

    public BookController(BookService bookService, ModelMapper modelMapper) {
        this.bookService = bookService;
        this.modelMapper = modelMapper;
    }

    @PostMapping("/add")
    public void addBook(BookDTO bookDTO) {
        var book = modelMapper.map(bookDTO, Book.class);
        bookService.addBook(book);
    }

    @GetMapping("/{id}")
    public BookDTO getBookById(@PathVariable int id) {
        var book = bookService.getBookById(id);
        return modelMapper.map(book, BookDTO.class);
    }

    @GetMapping("/find/name")
    public List<BookDTO> findBookByName(@RequestBody String name) {
        var book = bookService.getBooksByName(name);
        if (book == null) {
            return null;
        }
        List<BookDTO> bookDTO = null;
        book.forEach(x -> bookDTO.add(modelMapper.map(x, BookDTO.class)));
        return bookDTO;
    }

    @GetMapping("/find/author")
    public List<BookDTO> findBookByAuthor(@RequestBody String author) {
        var book = bookService.getBooksByAuthor(author);
        if (book == null) {
            return null;
        }
        List<BookDTO> bookDTO = null;
        book.forEach(x -> bookDTO.add(modelMapper.map(x, BookDTO.class)));
        return bookDTO;
    }

    @PatchMapping("/{id}/edit")
    public BookDTO editBook(@PathVariable String id, @RequestBody BookDTO bookDTO) {
        var book = modelMapper.map(bookDTO, Book.class);
        book = bookService.editBook(book);
        return modelMapper.map(book, BookDTO.class);
    }

    @DeleteMapping("/{id}/delete")
    public void deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
    }
}

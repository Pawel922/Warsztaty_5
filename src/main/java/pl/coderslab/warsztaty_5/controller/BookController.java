package pl.coderslab.warsztaty_5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.warsztaty_5.model.Book;
import pl.coderslab.warsztaty_5.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> books() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book bookById(@PathVariable long id) {
        Book book = bookService.getBookById(id);
        return book;
    }
}
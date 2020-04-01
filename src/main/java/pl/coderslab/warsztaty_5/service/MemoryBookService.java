package pl.coderslab.warsztaty_5.service;

import org.springframework.stereotype.Component;
import pl.coderslab.warsztaty_5.model.Book;

import java.util.List;

@Component
public class MemoryBookService implements BookService {

    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public Book getBookById(long id) {
        return null;
    }

    @Override
    public Book saveBook(Book book) {
        return null;
    }

    @Override
    public Book updateBook(long id, Book book) {
        return null;
    }

    @Override
    public void deleteBook(long id) {

    }
}

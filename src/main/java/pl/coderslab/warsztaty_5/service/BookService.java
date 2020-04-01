package pl.coderslab.warsztaty_5.service;

import pl.coderslab.warsztaty_5.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    Book getBookById(long id);

    Book saveBook(Book book);

    Book updateBook(long id, Book book);

    void deleteBook(long id);
}

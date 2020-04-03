package pl.coderslab.warsztaty_5.service;

import org.springframework.stereotype.Component;
import pl.coderslab.warsztaty_5.model.Book;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemoryBookService implements BookService {

    private List<Book> books;

    public MemoryBookService() {
        books = new ArrayList<>();
        books.add(new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel",
                "Helion", "programming"));
        books.add(new Book(2L, "9788324627738", "Rusz glowa, Java.",
                "Sierra Kathy, Bates Bert", "Helion", "programming"));
        books.add(new Book(3L, "9780130819338", "Java 2. Podstawy",
                "Cay Horstmann, Gary Cornell", "Helion", "programming"));
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public Book getBookById(long id) {
        Book foundBook = books.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElseThrow(()-> new RuntimeException("Book with given id does not exist"));
        return foundBook;
    }

    @Override
    public Book saveBook(Book book) {
        long lastId = books.stream()
                .mapToLong(Book::getId)
                .max()
                .orElse(0);
        book.setId(lastId + 1);
        books.add(book);
        return book;
    }

    @Override
    public Book updateBook(long id, Book book) {
        Book bookToUpdate = getBookById(id);
        bookToUpdate.setIsbn(book.getIsbn());
        bookToUpdate.setTitle(book.getTitle());
        bookToUpdate.setAuthor(book.getAuthor());
        bookToUpdate.setPublisher(book.getPublisher());
        bookToUpdate.setType(book.getType());
        return bookToUpdate;
    }

    @Override
    public void deleteBook(long id) {
        Book bookToDelete = getBookById(id);
        books.remove(bookToDelete);
    }
}

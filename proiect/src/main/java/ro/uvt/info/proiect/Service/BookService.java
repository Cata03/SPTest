package ro.uvt.info.proiect.Service;
import ro.uvt.info.proiect.Entity.Book;
import ro.uvt.info.proiect.Entity.BookAuthor;

import java.util.List;

public interface BookService {
    Book getBookById(Long id);
    List<Book> getBooks();
    Book createBook(String title);
    Book updateBook(String title, Long id);
    Book deleteBook(Long id);
    BookAuthor addAuthor(Long bookId, Integer authorId);
}

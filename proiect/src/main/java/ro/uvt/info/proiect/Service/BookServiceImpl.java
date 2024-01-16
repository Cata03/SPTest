package ro.uvt.info.proiect.Service;
import ro.uvt.info.proiect.Entity.Author;
import ro.uvt.info.proiect.Entity.Book;
import ro.uvt.info.proiect.Entity.BookAuthor;
import ro.uvt.info.proiect.Repository.AuthorRepository;
import ro.uvt.info.proiect.Repository.BookRepository;
import ro.uvt.info.proiect.Repository.BookAuthorRepository;
import ro.uvt.info.proiect.Repository.BookCrudRepositoryAdapter;
import ro.uvt.info.proiect.Service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private  AuthorRepository authorRepository;
    private  BookAuthorRepository bookAuthorRepository;

    private  BookCrudRepositoryAdapter bookRepository;

    @Override
    public Book getBookById(Long id) {
        return bookRepository.getReferenceById(id);
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book createBook(String title) {
        Book book = new Book();
        book.setTitle(title);
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(String title, Long id) {
        Book bookToUpdate = bookRepository.getReferenceById(id);
        bookToUpdate.setTitle(title);
        return bookRepository.save(bookToUpdate);
    }

    @Override
    public Book deleteBook(Long id) {
        Book bookToDelete = bookRepository.getReferenceById(id);
        bookRepository.delete(bookToDelete);
        return bookToDelete;
    }

    @Override
    public BookAuthor addAuthor(Long bookId, Integer authorId) {
        Book book = bookRepository.getReferenceById(bookId);
        Author author = authorRepository.getReferenceById(authorId);

        BookAuthor bookAuthor = new BookAuthor();

        bookAuthor.setBook(book);
        bookAuthor.setAuthor(author);

        return bookAuthorRepository.save(bookAuthor);
    }
}
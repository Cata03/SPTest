package ro.uvt.info.proiect.Command;
import ro.uvt.info.proiect.Entity.Book;
import ro.uvt.info.proiect.Service.BookService;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class GetBooksCmd implements Command {
    @Override
    public List<Book> execute(BookService bookService) {
        return bookService.getBooks();
    }
}

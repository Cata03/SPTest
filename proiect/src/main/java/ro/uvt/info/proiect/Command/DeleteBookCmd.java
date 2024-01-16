package ro.uvt.info.proiect.Command;
import ro.uvt.info.proiect.Entity.Book;
import ro.uvt.info.proiect.Service.BookService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteBookCmd implements Command {
    private Long id;

    @Override
    public Book execute(BookService bookService) {
        return bookService.deleteBook(id);
    }
}

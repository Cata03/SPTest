package ro.uvt.info.proiect.Command;
import ro.uvt.info.proiect.Service.BookService;
public interface Command {
    <T> T execute(BookService bookService);
}

package ro.uvt.info.proiect.Command;
import ro.uvt.info.proiect.Service.BookService;
public interface CommandExecutor {
    abstract Request executeCommand(Command command, BookService bookService);
}

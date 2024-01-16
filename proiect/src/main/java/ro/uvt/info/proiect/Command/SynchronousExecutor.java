package ro.uvt.info.proiect.Command;
import ro.uvt.info.proiect.Service.BookService;
public class SynchronousExecutor implements CommandExecutor
{
    @Override
    public Request executeCommand(Command command, BookService bookService) {
        return new Request<>(0, command, true, command.execute(bookService));
    }
}

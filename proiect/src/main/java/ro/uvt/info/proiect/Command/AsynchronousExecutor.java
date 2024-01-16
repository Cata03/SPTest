package ro.uvt.info.proiect.Command;
import ro.uvt.info.proiect.Service.BookService;
public class AsynchronousExecutor implements CommandExecutor
{
    @Override
    public Request executeCommand(Command command, BookService bookService) {
        return new Request<>(0, command, false, null);
    }
}

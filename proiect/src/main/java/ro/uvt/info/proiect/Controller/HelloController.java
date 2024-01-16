package ro.uvt.info.proiect.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.uvt.info.proiect.Component.ClientComponent;

@RestController
public class HelloController {

    private final ClientComponent clientComponent;

    public HelloController(ClientComponent clientComponent) {
        this.clientComponent = clientComponent;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello from ClientComponent = " + clientComponent.toString();
    }
}

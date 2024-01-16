package ro.uvt.info.proiect.Command;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Request<T> {
    private int id;
    private Command command;
    private boolean completed;
    private T result;

    public Request(T i, T command, T b, T execute) {
    }
}

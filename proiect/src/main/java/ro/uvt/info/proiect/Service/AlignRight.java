package ro.uvt.info.proiect.Service;

public class AlignRight implements AlignStrategy {

    public void render(String context) {
        System.out.println("Right Aligned:" + context);
    }

}

package ro.uvt.info.proiect.Service;

public class AlignLeft implements AlignStrategy {

    public void render(String context)
    {
        System.out.println("Left Aligned:" + context);
    }

}

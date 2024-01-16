package ro.uvt.info.proiect.Model;
import java.util.List;

public class TableOfContent {
    private List<String> elements;
    public void accept(Visitor visitor)
    {
        visitor.visitTableOfContent(this);
    }
    public void addElement(String element) {
        elements.add(element);
    }
    public void print() {
        System.out.println("Table of contents");
        for (String element : elements) {
            System.out.println(element);
        }
    }
}
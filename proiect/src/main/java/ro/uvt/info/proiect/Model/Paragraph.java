package ro.uvt.info.proiect.Model;
import ro.uvt.info.proiect.Service.*;
public class Paragraph implements Element{
    private String text;
    private AlignStrategy alignStrategy;
    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }
    public Paragraph(String text) {
        this.text = text;
    }
    public String getText()
    {
        return this.text;
    }
    public void accept(Visitor visitor)
    {
        visitor.visitParagraph(this);
    }
    public void print() {
        if (this.alignStrategy != null) {
            this.alignStrategy.render( this.text);
        } else {
            System.out.println("Paragraph: " + this.text);
        }
    }
}
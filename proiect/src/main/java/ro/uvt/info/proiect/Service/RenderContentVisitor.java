package ro.uvt.info.proiect.Service;
import ro.uvt.info.proiect.Model.*;

public class RenderContentVisitor implements Visitor {
    public void visitBook(Book book) {
        book.print();
    }

    public void visitSection(Section section) {
        section.print();
    }

    public void visitParagraph(Paragraph paragraph) {
        paragraph.print();
    }

    public void visitImageProxy(ImageProxy imageProxy) {
        imageProxy.print();
    }

    public void visitImage(Image image) {
        image.print();
    }

    public void visitTable(Table table) {
        table.print();
    }

    public void visitTableOfContent(TableOfContent tableOfContent) {
        tableOfContent.print();
    }
}

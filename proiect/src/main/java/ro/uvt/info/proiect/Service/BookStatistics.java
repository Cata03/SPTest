package ro.uvt.info.proiect.Service;
import ro.uvt.info.proiect.Model.*;
public class BookStatistics implements Visitor {

    private int images;
    private int tables;
    private int paragraphs;

    public BookStatistics() {
        this.images = 0;
        this.tables = 0;
        this.paragraphs = 0;
    }

    @Override
    public void visitBook(Book book) {

    }

    @Override
    public void visitSection(Section section) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        this.paragraphs += 1;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        this.images += 1;
    }

    @Override
    public void visitImage(Image image) {
        this.images += 1;
    }

    @Override
    public void visitTable(Table table) {
        this.tables += 1;
    }

    @Override
    public void visitTableOfContent(TableOfContent tableOfContent) {

    }

    public void printStatistics() {
        System.out.println("Book Statistics:");
        System.out.println("Number of images: " + this.images);
        System.out.println("Number of tables: " + this.tables);
        System.out.println("Number of paragraphs: " + this.paragraphs);
    }
}

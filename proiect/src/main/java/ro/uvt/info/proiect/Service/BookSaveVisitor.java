package ro.uvt.info.proiect.Service;

import ro.uvt.info.proiect.Model.*;

import java.io.FileWriter;
import java.io.IOException;

public class BookSaveVisitor implements Visitor {

    private StringBuilder jsonBuilder;

    public BookSaveVisitor() {
        this.jsonBuilder = new StringBuilder("[");
    }

    @Override
    public void visitBook(Book book) {

    }

    @Override
    public void visitSection(Section section) {
        appendToJSON("{\"type\":\"section\",\"title\":\"" + escapeJSONString(section.getTitle()) + "\"}");
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        appendToJSON("{\"type\":\"paragraph\",\"text\":\"" + escapeJSONString(paragraph.getText()) + "\"}");
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        appendToJSON("{\"type\":\"imageProxy\",\"url\":\"" + escapeJSONString(imageProxy.getUrl()) + "\"}");
    }

    @Override
    public void visitImage(Image image) {
        appendToJSON("{\"type\":\"image\",\"url\":\"" + escapeJSONString(image.getUrl()) + "\"}");
    }

    @Override
    public void visitTable(Table table) {
        appendToJSON("{\"type\":\"table\",\"title\":\"" + escapeJSONString(table.getTitle()) + "\"}");
    }

    @Override
    public void visitTableOfContent(TableOfContent tableOfContent) {
        // Handle TableOfContent if needed
    }

    public void exportJSON() {
        appendToJSON("]");

        try (FileWriter file = new FileWriter("Book.json")) {
            file.write(jsonBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void appendToJSON(String jsonString) {
        if (jsonBuilder.length() > 1) {
            jsonBuilder.append(",");
        }
        jsonBuilder.append(jsonString);
    }

    private String escapeJSONString(String input) {
        return input.replace("\"", "\\\"");
    }
}

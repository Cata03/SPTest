package ro.uvt.info.proiect.Model;
public class Table implements Element{
    private String title;

    public void accept(Visitor visitor)
    {
        visitor.visitTable(this);
    }
    public Table(String title) {
        this.title = title;
    }

    public String getTitle()
    {
        return this.title;
    }
    public void print() {
        System.out.println("Table with title: " + title);
    }
}
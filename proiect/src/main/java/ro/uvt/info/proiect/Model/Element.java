package ro.uvt.info.proiect.Model;
public interface Element
{
    void print();
    void accept(Visitor visitor);
}

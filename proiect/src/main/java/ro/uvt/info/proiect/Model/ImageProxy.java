package ro.uvt.info.proiect.Model;
public class ImageProxy implements Element {
    private String url;
    private Image realImage;

    public ImageProxy(String url, Image img) {
        this.url = url;
        this.realImage = null;
    }
    public String getUrl()
    {
        return this.url;
    }
    public void accept(Visitor visitor)
    {
        visitor.visitImageProxy(this);
    }
    public void print() {
        this.realImage.print();
    }
}

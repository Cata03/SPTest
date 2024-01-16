package ro.uvt.info.proiect.Model;

import ro.uvt.info.proiect.Service.ImageLoaderFactory;

import java.util.concurrent.TimeUnit;
public class Image implements Element{
    private ImageContent imageContent;
    private String url;
    public void accept(Visitor visitor)
    {
        visitor.visitImage(this);
    }
    public Image(ImageContent content)
    {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.url = url;
        ImageLoaderFactory imageLoaderFactory = new ImageLoaderFactory();
    }
    public String getUrl()
    {
        return this.url;
    }
    public void print() {
        System.out.println("Image with link: " + url);
    }
}
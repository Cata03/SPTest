package ro.uvt.info.proiect.Service;

import ro.uvt.info.proiect.Model.ImageContent;

public class JPGImageLoader implements ImageLoader {
    private String url;

    public JPGImageLoader(String url) {
        this.url = url;
    }

    public ImageContent load(String url) {
        return new ImageContent(url);
    }
}

package ro.uvt.info.proiect.Service;

import ro.uvt.info.proiect.Model.ImageContent;

public class BMPImageLoader implements ImageLoader {
    private String url;

    public BMPImageLoader(String url) {
        this.url = url;
    }

    public ImageContent load(String url) {
        return new ImageContent(url);
    }

}

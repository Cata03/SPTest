package ro.uvt.info.proiect.Service;
import ro.uvt.info.proiect.Model.*;

public class ImageLoaderFactory {
    private ImageLoader imageLoader;

    public ImageLoaderFactory() {
        this.imageLoader = null;
    }

    public ImageContent createImageLoader(String url) {
        String extension = url.substring(url.indexOf('.') + 1);

        if (extension.equals("jpg")) {
            this.imageLoader = new JPGImageLoader(url);
        } else if (extension.equals("bmp")) {
            this.imageLoader = new BMPImageLoader(url);
        }

        return this.imageLoader.load(url);
    }
}

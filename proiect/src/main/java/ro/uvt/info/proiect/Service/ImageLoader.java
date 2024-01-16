package ro.uvt.info.proiect.Service;

import ro.uvt.info.proiect.Model.ImageContent;

public interface ImageLoader {
    ImageContent load(String url);
}

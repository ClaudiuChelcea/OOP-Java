package Visitor_Pattern.task1.document;

public class UrlSegment extends TextSegment {
    String url;
    String description;

    public UrlSegment(String url, String description) {
        super("");
        this.url = url;
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

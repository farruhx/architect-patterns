package farruh.arch.hub.patterns.proxy.udemy;

public class Image {

    protected String url;

    public Image(String url) {
        this.url = url;
    }

    public void draw() {
        System.out.println("Drawing image + from this url" + url);
    }
}

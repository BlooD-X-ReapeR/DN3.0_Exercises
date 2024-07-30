public class ProxyImage implements Image {
    private String url;
    private RealImage realImage;

    public ProxyImage(String url) {
        this.url = url;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(url);
        } else {
            System.out.println("Image already loaded. Using cached version.");
        }
        realImage.display();
    }
}

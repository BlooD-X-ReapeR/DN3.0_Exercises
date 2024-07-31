import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class RealImage implements Image {
    private String url;
    private BufferedImage image;

    public RealImage(String url) {
        this.url = url;
        loadImage();
    }

    private void loadImage() {
        try {
            URL imageUrl = new URL(url);
            image = ImageIO.read(imageUrl);
            System.out.println("Loading image from " + url);
        } catch (IOException e) {
            System.out.println("Failed to load image from " + url);
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + url);
        // Here you can add code to display the image using a GUI framework like Swing
    }

    public BufferedImage getImage() {
        return image;
    }
}

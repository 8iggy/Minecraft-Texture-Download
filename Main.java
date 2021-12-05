import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Main extends Thread {

    public static void main(String[] args) {
        new Main().start();
    }

    public void start() {
        //Optional
        File file = new File("C:\\filelocation\\photo.png");
        BufferedImage image = getTexture("barrier"); //NO CAPS
        try {
            ImageIO.write(image, "png", file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Optional
    }

    public BufferedImage getTexture(String texture) {

        URL url;
        BufferedImage image = null;
        try {
            url = new URL("https://raw.githubusercontent.com/InventivetalentDev/minecraft-assets/1.17.1/assets/minecraft/textures/item/" + texture + ".png");
            image = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;

    }

}

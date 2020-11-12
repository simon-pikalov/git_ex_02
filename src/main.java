import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class main {

    public static void main(String[] args) {

        try {
            Desktop.getDesktop().browse(new URI("https://github.com/simon-pikalov/Ariel_OOP_2020/tree/master/Classes/week_03/ta3/simon_group"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        System.out.println("more code to come");

    }

}

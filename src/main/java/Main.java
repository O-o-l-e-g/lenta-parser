import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import java.io.IOException;

public class Main {

    public static void main( String[] args ) throws IOException {
        Document doc = Jsoup.connect("https://lenta.com/catalog/alkogolnye-napitki/vino/").get();
        String title = doc.title();
        System.out.println("Title : " + title);

    }
}
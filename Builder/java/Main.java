import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("text")) {
            TextBuilder text_builder = new TextBuilder();
            Director director = new Director(text_builder);
            director.construct();
            String result = text_builder.getTextResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder html_builder = new HTMLBuilder();
            Director director = new Director(html_builder);
            director.construct();
            String filename = html_builder.getHTMLResult();
            System.out.println(filename + " is created.");
        } else {
            usage();
            System.exit(0);
        }
    }

    public static void usage() {
        System.out.println("Usage: java Main text        create text");
        System.out.println("Usage: java Main html        create html file");
    }
}

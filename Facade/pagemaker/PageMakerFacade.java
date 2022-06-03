package pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMakerFacade {
    private PageMakerFacade() {}

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title(username + "'s Web Page.");
            writer.paragraph("Welcome to " + username + "'s Web Page.");
            writer.paragraph("This is the sample for Facade DesignPattern.");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ").");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
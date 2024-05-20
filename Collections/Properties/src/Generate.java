import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Generate {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("name", "Haneen");
        prop.setProperty("age", "21");
        prop.setProperty("Phone", "01559844210");
        prop.setProperty("email","hanoona0010@gmail.com");
        prop.store(new FileWriter("info.properties"),"HanonaInfo");

    }
}

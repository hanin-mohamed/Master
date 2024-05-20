import java.io.FileReader;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception{
     //subclass of hashtable
        FileReader reader =new FileReader("db.properties");
        Properties prop = new Properties();
        prop.load(reader);
        System.out.println(prop.getProperty("user"));
        System.out.println(prop.getProperty("password"));

    }
}
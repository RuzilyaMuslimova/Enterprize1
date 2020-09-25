import java.io.*;
import java.util.Properties;

public class Properties_ {

    public static void main(String[] args) {

        FileInputStream fis;
        Properties property = new Properties();

        try {
            fis = new FileInputStream("src/main/resources/database.properties");
            property.load(fis);

            String url = property.getProperty("database.url");
            String username = property.getProperty("database.username");
            String password = property.getProperty("database.password");

            System.out.println("URL: " + url
                    + ", USERNAME: " + username
                    + ", PASSWORD: " + password);

        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }

    }

}
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class Application {

    public static void main(String[] args) throws IOException {

        Application main = new Application();
        File file = main.getFileFromResources("database.properties");

        printFile(file);
    }

    // получить файл из classpath, папки ресурсов
    private File getFileFromResources(String fileName) {

        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }

    }

    private static void printFile(File file) throws IOException {

        if (file == null) return;

        FileReader reader = new FileReader(file);
        try {
            BufferedReader br = new BufferedReader(reader);
            try {

                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } finally {
                br.close();
            }
        } finally {
            reader.close();
        }
    }

}

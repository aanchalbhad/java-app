import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            File logDir = new File("/app/logs");
            if (!logDir.exists()) {
                logDir.mkdirs();
            }

            FileWriter writer = new FileWriter("/app/logs/output.txt", true);
            writer.write("Hello from Dockerized Java App with logs!\n");
            writer.close();

            System.out.println("Log written to /app/logs/output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

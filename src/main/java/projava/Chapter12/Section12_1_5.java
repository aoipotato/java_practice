package projava.Chapter12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Section12_1_5 {
    public static void main(String[] args) throws IOException {
        var message = """
                test
                message
                """;
        var p = Path.of("test.txt");

        try {
            Files.writeString(p, message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

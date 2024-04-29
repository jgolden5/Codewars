import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;

public class Decoder {
    public String decode(File messageFile) throws IOException {
        ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(messageFile.toPath(), Charset.defaultCharset());
        for(String line : lines) {
            System.out.println(line);
        }
        return null;
    }
}

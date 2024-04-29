import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File f1 = new File("/Users/jgolden1/example.txt");
        Decoder decoder = new Decoder();
        try {
            decoder.decode(f1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
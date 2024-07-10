import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File f = new File("/Users/jgolden1/Downloads/coding_qual_input.txt");
        Decoder decoder = new Decoder();
        try {
            System.out.println(decoder.decode(f));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
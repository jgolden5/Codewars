import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;

public class Decoder {

    public String decode(File messageFile) throws IOException {
        ArrayList<String> fileLines = (ArrayList<String>) Files.readAllLines(messageFile.toPath(), Charset.defaultCharset());
        ArrayList<Integer> pyramidLineEndIndices = getPyramidLineEndIndices(fileLines.size());
        HashMap<Integer, String> numberToContent = new HashMap<>();
        return null;
    }

    public ArrayList<Integer> getPyramidLineEndIndices(int fileLength) {
        ArrayList<Integer> pyramidLineEndIndices = new ArrayList<>();
        int n = 1;
        int interval = 2;
        while(n <= fileLength) {
            pyramidLineEndIndices.add(n);
            n += interval;
            interval++;
        }
        return pyramidLineEndIndices;
    }

}

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Decoder {

    public String decode(File messageFile) throws IOException {
        ArrayList<String> fileLines = (ArrayList<String>) Files.readAllLines(messageFile.toPath(), Charset.defaultCharset());
        ArrayList<String> pyramidLineEndIndices = generateEndIndices(fileLines.size());
        String[] unsortedDecodedLines = calculateDecodedLines(pyramidLineEndIndices);
        String[] sortedDecodedLines = sortDecodedLines(unsortedDecodedLines);
        return getDecodedMessage(sortedDecodedLines);
    }

    public ArrayList<String> generateEndIndices(int fileLength) {
        ArrayList<String> pyramidLineEndIndices = new ArrayList<>();
        int n = 1;
        int interval = 2;
        while(n <= fileLength) {
            pyramidLineEndIndices.add(Integer.toString(n));
            n += interval;
            interval++;
        }
        return pyramidLineEndIndices;
    }

    private String[] calculateDecodedLines(ArrayList<String> pyramidLineEndIndices) {
        return null;
    }

    private String[] sortDecodedLines(String[] unsortedDecodedLines) {
        return null;
    }

    private String getDecodedMessage(String[] decodedLinesInOrder) {
        return null;
    }

}

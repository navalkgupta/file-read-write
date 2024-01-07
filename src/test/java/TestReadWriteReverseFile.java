import org.example.FileReader;
import org.example.FileWriter;
import org.example.ReadWriteReverseFile;
import org.junit.Assert;
import org.junit.Test;

public class TestReadWriteReverseFile {


    @Test
    public void testReadWriteReverse(){
        String input = "PQRS";
        FileReader testReader = new FileReader() {
            @Override
            public String readFile(String filePath) {
                return input;
            }
        };

        FileWriter testWriter = new FileWriter() {
            @Override
            public void writeToFile(String filePath, String data) {
                // do nothing
            }
        };

        ReadWriteReverseFile readWriteReverseFile = new ReadWriteReverseFile(testReader, testWriter);
        String output = readWriteReverseFile.writeAsReverse();

        Assert.assertEquals("SRQP", output);

    }



}

package org.example;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriterImpl implements FileWriter {
    public void writeToFile(String filePath, String data) {
        try{
            Files.write(Paths.get(filePath), data.getBytes(StandardCharsets.UTF_8));
        }catch (Exception e){
            System.out.println("Exception occurred while writing to the file!!");
            throw new RuntimeException(e.getMessage());
        }
    }
}

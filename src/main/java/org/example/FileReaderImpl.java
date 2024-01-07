package org.example;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReaderImpl implements FileReader {
    public String readFile(String filePath) {
        String fileData = null;
        try{
            fileData = new String(Files.readAllBytes(Paths.get(filePath)));
        }catch (Exception e){
            System.out.println("Exception while reading data from file!!");
            throw new RuntimeException(e.getMessage());
        }
        return fileData;
    }
}

package org.example;

import java.nio.file.Paths;

public class ReadWriteReverseFile {

    private final FileReader fileReader;
    private final FileWriter fileWriter;

    public ReadWriteReverseFile(FileReader fileReader, FileWriter fileWriter){
        this.fileReader = fileReader;
        this.fileWriter = fileWriter;
    }

    public String writeAsReverse(){
        String data = this.fileReader.readFile(Paths.get("src", "main", "resources", "input.txt").toString());
        String reverseData = new StringBuilder(data).reverse().toString();
        this.fileWriter.writeToFile(Paths.get("src", "main", "resources", "output.txt").toString(),
                reverseData);
        return  reverseData;
    }


}

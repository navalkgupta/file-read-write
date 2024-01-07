package org.example;

public class Main {
    public static void main(String[] args) {

        ReadWriteReverseFile readWriteReverseFile = new ReadWriteReverseFile(new FileReaderImpl(), new FileWriterImpl());
        readWriteReverseFile.writeAsReverse();
    }
}
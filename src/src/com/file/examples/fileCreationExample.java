package com.file.examples;

import java.io.File;
import java.io.IOException;

public class fileCreationExample {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\krunal\\Desktop\\samplefile.txt");
        try {
            boolean fileCreated = file.createNewFile();
            System.out.println(fileCreated);
        } catch (IOException ioException) {

        }
    }
}

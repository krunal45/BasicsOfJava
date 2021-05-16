package com.IOStreamsExample;

import java.io.*;

public class BufferedReaderExample {

    public static void main(String[] args) throws IOException {
        File file = new File("I:\\java_coding\\JavaBasics\\src\\src\\com\\IOStreamsExample\\sampletxtfile.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}

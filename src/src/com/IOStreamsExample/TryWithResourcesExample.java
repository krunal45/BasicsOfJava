package com.IOStreamsExample;

import java.io.*;

public class TryWithResourcesExample {
    /*
    try with reources will release the resource once usage is over
     */

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new StringReader("Hello World"));
             StringWriter writer = new StringWriter();
        ) {
            writer.write(reader.readLine());
            System.out.println(writer.toString());
        } catch (IOException io) {

        }
    }
}

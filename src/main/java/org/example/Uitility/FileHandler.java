package org.example.Uitility;

import java.io.IOException;
import java.io.PrintStream;

public class FileHandler {

    public void writeToFile(String fileName, String content) {
        try {
            PrintStream oFile = new PrintStream(fileName);
            oFile.print(content);
            oFile.close();
        } catch (IOException ioe) {
            System.out.println("\n*** I/O Error ***\n" + ioe);
        }

    }
}

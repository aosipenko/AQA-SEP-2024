package org.prog.exceptions;

import javax.imageio.IIOException;
import java.io.*;

//TODO: write method that will count text file lines and print it (put it in separate method)
// (you can use ChatGPT to generate this part)
// Trasnform FileNotFoundException into RuntimeException
// Catch this exception in main method call this method once for existing file
// second time for non-existing file
// print "YAY!" after file reading is done
public class ExceptionsHomework {

    public static void main(String[] args) {
        FileReader("C:\\Users\\sergi\\IdeaProjects\\AQA-SEP-2024\\README.md");
        FileReader("C:\\Users\\sergi\\IdeaProjects\\AQA-SEP-202\\README.md");
    }

    public static void FileReader(String fileName) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                throw new FileNotFoundException("File not found:" + fileName);
            }
            System.out.println("File" + fileName + "exists");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Runtime exception:" + e.getMessage(), e);
        }
            System.out.println(" YAY ");
    }

}



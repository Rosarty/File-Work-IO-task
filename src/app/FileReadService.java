package app;


import java.io.FileInputStream;
import java.io.IOException;

public class FileReadService {
    public void readFromFile(String fileName) {
        try (FileInputStream fis =
                     new FileInputStream(Constants.BASE_PATH_IN + fileName + ".txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong while reading the file: " + e.getMessage());
        }
    }
}


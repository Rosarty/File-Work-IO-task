package app;


import java.io.IOException;

import java.io.FileOutputStream;


public class FileWriteService {

    public void writeToFile(String fileName, String content) {
        try (FileOutputStream fos =
                     new FileOutputStream(Constants.BASE_PATH_IN + fileName + ".txt")) {
            fos.write(content.getBytes());
            System.out.println("File created and written successfully.");
        } catch (IOException e) {
            System.out.println("Something went wrong while writing to the file: "
                    + e.getMessage());
        }
    }
}


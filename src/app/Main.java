package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriteService fileWriteService = new FileWriteService();
        FileReadService fileReadService = new FileReadService();

        System.out.println("Choose an action:");
        System.out.println("1. Create and write to a file");
        System.out.println("2. Read from a file");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the file name (without extension):");
                String fileName = scanner.next();
                System.out.println("Enter the content to write to the file:");
                scanner.nextLine();
                String content = scanner.nextLine();
                fileWriteService.writeToFile(fileName, content);
                break;
            case 2:
                System.out.println("Enter the file name to read:");
                String fileToRead = scanner.next();
                fileReadService.readFromFile(fileToRead);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}

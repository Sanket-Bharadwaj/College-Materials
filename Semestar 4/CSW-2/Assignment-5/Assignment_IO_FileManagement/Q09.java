/*
 Question 9:
 Create and Write to a File:Write a Java program that prompts the user for a diary entry, then creates a file named 
 "diary.txt" and writes the current date followed by the user's entry into this file.Ensure the program checks if the 
 file already exists and informs the user, to avoid overwriting any previous content
 */



package Assignment_IO_FileManagement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class DiaryEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("diary.txt");

        if (file.exists()) {
            System.out.println("The file 'diary.txt' already exists. Entry not saved to avoid overwriting.");
        } else {
            try {
                System.out.print("Enter your diary entry: ");
                String entry = sc.nextLine();
                FileWriter writer = new FileWriter(file);
                writer.write("Date: " + LocalDate.now() + "\n");
                writer.write(entry);
                writer.close();
                System.out.println("Diary entry saved to 'diary.txt'.");
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file.");
                e.printStackTrace();
            }
        }

        sc.close();
    }
}
e

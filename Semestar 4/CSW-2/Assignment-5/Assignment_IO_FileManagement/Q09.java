/*
 Question 9:
 Create and Write to a File:Write a Java program that prompts the user for a diary entry, then creates a file named 
 "diary.txt" and writes the current date followed by the user's entry into this file.Ensure the program checks if the 
 file already exists and informs the user, to avoid overwriting any previous content
 */

package Assignment_IO_FileManagement;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diary Entry: ");
        String diaryEntry = sc.nextLine();
        String dateNow = LocalDate.now().toString();

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String timeNow = LocalTime.now().format(timeFormatter);

        diaryEntry += "\n" + dateNow + " " + timeNow;

        File newFile = new File("E:\\CSW\\CSW2\\String\\src\\Assignment_IO_FileManagement\\diary.txt");

        try {
           
            if (newFile.exists()) {
                System.out.println("File already exists.");
                System.out.println("Are you sure you want to overwrite this file? (Y/N)");
                String choice = sc.next().toUpperCase();

                if (choice.equals("Y")) 
	                {
	                    newFile.delete();
	                    newFile.createNewFile();
	                    System.out.println("File overwritten successfully.");
	                } 
                else 
	                {
	                    System.out.println("File not deleted. Exiting.");
	                    return;
	                }
            } 
            else 
	            {
	                newFile.createNewFile();
	                System.out.println("File created successfully.");
	            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(newFile, true))) 
	            {
	                writer.write(diaryEntry);
	                writer.newLine();
	            }

            System.out.println("Diary entry saved successfully.");
        } 
        catch (IOException e) 
	        {
	            System.out.println("An error occurred while handling the file: " + e.getMessage());
	        } 
        finally 
	        {
	            sc.close();
	        }
    }
}
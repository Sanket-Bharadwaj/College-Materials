package Assignment;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class DiaryEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);
        
        System.out.print("Please enter your diary entry: ");
        String diaryEntry = sc.nextLine();
        
        String newFile = "E:\\CSW\\CSW2\\String\\src\\Assignment\\diary.txt";
        File diaryFile = new File(newFile);
        
        if (diaryFile.exists()) {
            System.out.println("The file 'diary.txt' already exists. Please choose a different name or delete the existing file.");
            
        } else {
            try (FileWriter writer = new FileWriter(diaryFile)) {
                writer.write("Date: " + currentDate + "\n");
                writer.write("Diary Entry: " + diaryEntry + "\n");
                System.out.println("Diary entry saved successfully!");
            } catch (Exception e) {
                System.out.println("An error occurred while writing to the file.");
                e.printStackTrace();
            }
            File.delete();
        }
        
        sc.close();
    }
}
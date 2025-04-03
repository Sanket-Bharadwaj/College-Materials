package Assignment_IO_FileManagement;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your diary entry:");
        String entry = sc.nextLine();
        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = now.format(formatter);
        
        String diaryEntry = timestamp + " - " + entry ;
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\CSW\\CSW2\\String\\src\\Assignment_IO_FileManagement\\diary.txt", true))) 
	        {
	            writer.write(diaryEntry);
	            System.out.println("Diary entry added successfully!");
	        } 
        catch (IOException e) 
	        {
	            System.err.println("An error occurred while writing to the file: " + e.getMessage());
	        } 
        finally {
            sc.close();
        }
    }
}
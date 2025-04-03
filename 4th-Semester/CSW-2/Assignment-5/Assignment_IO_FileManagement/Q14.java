package Assignment_IO_FileManagement;

import java.io.*;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the source file path:");
        String sourcePath = sc.nextLine();
        
        System.out.println("Enter the destination file path:");
        String destinationPath = sc.nextLine();
        
        File sourceFile = new File(sourcePath);
        File destinationFile = new File(destinationPath);
        
        if (!sourceFile.exists()) 
	        {
	            System.out.println("Source file does not exist.");
	        }
        
        if (destinationFile.exists()) 
	        {
	            System.out.println("Destination file already exists. Do you want to overwrite it? (Y/N)");
	            String choice = sc.next().toUpperCase();
	            if (!choice.equals("Y")) 
		            {
		                System.out.println("Copy operation cancelled.");
		              
		            }
	        }
	        
        try (InputStream in = new FileInputStream(sourceFile);
             OutputStream out = new FileOutputStream(destinationFile)) 
	        {
	             
	            byte[] buffer = new byte[1024];
	            int length;
	            while ((length = in.read(buffer)) > 0) 
		            {
		                out.write(buffer, 0, length);
		            }
	            System.out.println("File copied successfully.");
	        } 
        catch (IOException e) 
	        {
	            System.out.println("An error occurred during the copy operation: " + e.getMessage());
	        } 
        finally 
	        {
	            sc.close();
	        }
    }
}
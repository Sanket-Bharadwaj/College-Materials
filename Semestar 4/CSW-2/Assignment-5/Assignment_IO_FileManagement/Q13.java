package Assignment_IO_FileManagement;

import java.io.File;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the name of the file to delete:");
        String fileName = sc.nextLine();
        
        File fileToDelete = new File(fileName);
        
        if (fileToDelete.exists()) 
	        {
	            if (fileToDelete.delete()) 
		            {
		                System.out.println("File deleted successfully: " + fileToDelete.getAbsolutePath());
		            } 
	            else 
		            {
		                System.out.println("Failed to delete the file: " + fileToDelete.getAbsolutePath());
		            }
	        }
        
        else 
	        {
	            System.out.println("File does not exist: " + fileToDelete.getAbsolutePath());
	        }
        
        sc.close();
    }
}


package Assignment_IO_FileManagement;

import java.io.File;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter a directory path: ");
        String directoryPath = sc.nextLine();
        
        File directory = new File(directoryPath);
        
        if (directory.exists() && directory.isDirectory()) {
            String[] filesAndDir = directory.list();
            if (filesAndDir != null) 
	            {
	                System.out.println("Files and directories in " + directoryPath + ":");
	                for (String name : filesAndDir) 
		                {
		                    System.out.println(name);
		                }
            } 
            else 
	            {
	                System.out.println("The directory is empty.");
	            }
        } 
        else 
	        {
	            System.out.println("The specified directory does not exist.");
	        }
        
        sc.close();
    }
}



 //Question 8
/*
Interactive String Explorer: Prompt the user for a string. Display a menu 
with options to perform various operations: convert to lowercase/uppercase,
search for a character/index, or concatenate with another string. Based on 
user selection, perform the appropriate string operation and show the 
result.


Create an interactive string explorer that prompts the user for a string and offers options to 
convert to lowercase/uppercase, search for a character/index, or concatenate with another string.
Perform the selected operation and display the result.


*/

package Assignment_Strings;

import java.util.Scanner;

public class InteractiveStringExplorer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Convert to Lowercase");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Search for a Character/Index");
            System.out.println("4. Concatenate with Another String");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("\nLowercase String: " + inputString.toLowerCase());
                    break;
                case 2:
                    System.out.println("\nUppercase String: " + inputString.toUpperCase());
                    break;
                case 3:
                    System.out.print("\nEnter a character to search for: ");
                    char searchChar = sc.next().charAt(0);
                    int index = inputString.indexOf(searchChar);
                    if (index != -1) {
                        System.out.println("Character '" + searchChar + "' found at index: " + index);
                    } else {
                        System.out.println("Character '" + searchChar + "' not found in the string.");
                    }
                    break;
                case 4:
                    System.out.print("\nEnter another string to concatenate: ");
                    String newString = sc.nextLine();
                    System.out.println("Concatenated String: " + inputString +" "+ newString);
                    break;
                case 5:
                    System.out.println("\nExiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}

//Question4

/*
 Create a Java program that uses StringBuilder to perform a series of 
 text manipulations on a user-provided string. The program should allow 
 users to:
	a.Add a substring at a specified position.
	b.Remove a range of characters from the string.
	c.Modify a character at a specified index.
	d.Concatenate another string at the end.
	e.Display the current string after each operation.
The program should repeatedly prompt the user to choose an operation 
until they decide to exit. After each operation, it should display the
modified string, demonstrating the mutable nature of StringBuilder.
 */


package Assignment;

import java.util.Scanner;

public class StringBuilderManipulations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());

        int choice;
        do {
            
            System.out.println("\nMenu:");
            System.out.println("1. Add a substring at a specified position");
            System.out.println("2. Remove a range of characters");
            System.out.println("3. Modify a character at a specified index");
            System.out.println("4. Concatenate another string at the end");
            System.out.println("5. Display the current string");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter the substring to add: ");
                    String substring = scanner.nextLine();
                    System.out.print("Enter the position: ");
                    int position = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    if (position >= 0 && position <= stringBuilder.length()) {
                        stringBuilder.insert(position, substring);
                        System.out.println("Updated string: " + stringBuilder);
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the start index: ");
                    int start = scanner.nextInt();
                    System.out.print("Enter the end index: ");
                    int end = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    if (start >= 0 && end <= stringBuilder.length() && start < end) {
                        stringBuilder.delete(start, end);
                        System.out.println("Updated string: " + stringBuilder);
                    } else {
                        System.out.println("Invalid range.");
                    }
                    break;
                case 3:
                    // Modify a character at a specified index
                    System.out.print("Enter the index to modify: ");
                    int index = scanner.nextInt();
                    System.out.print("Enter the new character: ");
                    char newChar = scanner.next().charAt(0);
                    scanner.nextLine(); // Consume newline character
                    if (index >= 0 && index < stringBuilder.length()) {
                        stringBuilder.setCharAt(index, newChar);
                        System.out.println("Updated string: " + stringBuilder);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 4:
                    // Concatenate another string at the end
                    System.out.print("Enter the string to concatenate: ");
                    String newString = scanner.nextLine();
                    stringBuilder.append(newString);
                    System.out.println("Updated string: " + stringBuilder);
                    break;
                case 5:
                    // Display the current string
                    System.out.println("Current string: " + stringBuilder);
                    break;
                case 6:
                    // Exit the program
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}

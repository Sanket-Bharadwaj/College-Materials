//Question 3
/*
 Write a Java program that uses StringBuffer to construct a simple text editor which 
 can perform the following operations:
	a.Append a given string to the existing text.
	b.Insert a given string at a specified index within the existing text.
	c.Delete a portion of text between two specified indices.
	d.Reverse the entire text.
	e.Replace a portion of the text between two specified indices with a 
	given string.
Your program should display a menu with options to perform each of the 
above operations. After each operation, print the current state of the 
text. Also, display the current capacity and length of the StringBuffer 
after each operation to showcase its dynamic nature.
 */
package Assignment_Strings;


import java.util.*;

public class TextEditor {
    public static void main(String[] args) {
        StringBuffer textBuffer = new StringBuffer();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Append text");
            System.out.println("2. Insert text");
            System.out.println("3. Delete text");
            System.out.println("4. Reverse text");
            System.out.println("5. Replace text");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:           // if we press 1 
                    System.out.print("Enter text to append: ");
                    String appendText = sc.nextLine();
                    textBuffer.append(appendText);
                    break;

                case 2:
                    System.out.print("Enter text to insert: ");
                    String insertText = sc.nextLine();
                    System.out.print("Enter position to insert text: ");
                    int insertPosition = sc.nextInt();
                    sc.nextLine(); 
                    if (insertPosition >= 0 && insertPosition <= textBuffer.length()) 
	                    {
	                        textBuffer.insert(insertPosition, insertText);
	                    } 
                    else 
	                    {
	                        System.out.println("Invalid position!");
	                    }
                    break;

                case 3:
                    System.out.print("Enter start index for deletion: ");
                    int startIndex = sc.nextInt();
                    System.out.print("Enter end index for deletion: ");
                    int endIndex = sc.nextInt();
                    sc.nextLine();
                    if (startIndex >= 0 && endIndex <= textBuffer.length() && startIndex < endIndex) {
                        textBuffer.delete(startIndex, endIndex);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;

                case 4:
                    textBuffer.reverse();
                    break;

                case 5:
                    System.out.print("Enter start index for replacement: ");
                    int replaceStart = sc.nextInt();
                    System.out.print("Enter end index for replacement: ");
                    int replaceEnd = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter replacement text: ");
                    String replacementText = sc.nextLine();
                    if (replaceStart >= 0 && replaceEnd <= textBuffer.length() && replaceStart < replaceEnd) {
                        textBuffer.replace(replaceStart, replaceEnd, replacementText);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("Current text: " + textBuffer.toString());
            System.out.println("Current length: " + textBuffer.length());
            System.out.println("Current capacity: " + textBuffer.capacity());
        }
    }
}

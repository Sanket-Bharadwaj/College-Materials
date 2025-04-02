//Question 5

/*
 Case Conversion and Comparison: Prompt the user to input two strings.
 Convert both strings to lowercase and uppercase. Compare the converted 
 strings to check case-insensitive equality. Display the converted strings 
 and the result of the comparison.
*/

package Assignment;

import java.util.Scanner;

public class CaseConversionComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = sc.nextLine();

        String lowercaseString1 = string1.toLowerCase();
        String lowercaseString2 = string2.toLowerCase();
        String uppercaseString1 = string1.toUpperCase();
        String uppercaseString2 = string2.toUpperCase();

        boolean areEqual = lowercaseString1.equals(lowercaseString2);

        System.out.println("\nConverted Strings:");
        System.out.println("Lowercase: '" + lowercaseString1 + "' and '" + lowercaseString2 + "'");
        System.out.println("Uppercase: '" + uppercaseString1 + "' and '" + uppercaseString2 + "'");
        System.out.println("\nAre the two strings case-insensitively equal? " + (areEqual ? "Yes" : "No"));

        sc.close();
    }
}

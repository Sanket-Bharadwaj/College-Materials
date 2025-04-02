//Write a Java program that demonstrates the immutability of the String 
//class and how it implements the CharSequence interface. Your program 
//should illustrate the behaviours that highlight String immutability and 
//its usage as a CharSequence.

package Assignment;

public class StringImmutability {
    public static void main(String[] args) {
        // Demonstrating String immutability
        String str = "Hello";
        System.out.println("Original String: " + str);
        
        // Trying to modify the String (creates a new object instead)
        String newStr = str.concat(" World");
        System.out.println("After concatenation: " + newStr);
        System.out.println("Original String remains unchanged: " + str);

        // Demonstrating CharSequence interface methods
        CharSequence charSeq = "ImmutableString"; // String implements CharSequence

        System.out.println("CharSequence: " + charSeq);
        System.out.println("Character at index 5: " + charSeq.charAt(5));
        System.out.println("Substring (0 to 9): " + charSeq.subSequence(0, 9));
        System.out.println("Length of CharSequence: " + charSeq.length());
    }
}

/*
Question 2
Write a Java program that demonstrates the immutability of the String 
class and how it implements the CharSequence interface. Your program 
should illustrate the behaviours that highlight String immutability and 
its usage as a CharSequence.
*/

package Assignment_Strings;

public class StringImmutability {
    public static void main(String[] args) {
        String original = "Hello";
        System.out.println("Original String: " + original);
        
        String modified = original.concat(" World");
        System.out.println("After concat: " + modified);
        System.out.println("Original String remains unchanged: " + original);
        
        CharSequence charSeq = "Immutable String as CharSequence";
        System.out.println("CharSequence: " + charSeq);
        
        System.out.println("Character at index 5: " + charSeq.charAt(5));
        System.out.println("Subsequence (0, 9): " + charSeq.subSequence(0, 9));
        System.out.println("Length of CharSequence: " + charSeq.length());
    }
}

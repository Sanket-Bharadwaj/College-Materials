//Question 7

/*
  
 Word Replacement in Sentences: Request a sentence and two words from the 
 user: one to search for and one to replace it with. Find the first 
 occurrence of the search word in the sentence. Replace the word using 
 substring operations and concatenation. Display the original and the 
 modified sentences.
 
*/

package Assignment_Strings;

import java.util.Scanner;

public class WordReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to search for: ");
        String searchWord = sc.next();

        System.out.print("Enter the word to replace it with: ");
        String replaceWord = sc.next();

        int index = sentence.indexOf(searchWord);

        if (index != -1) 
	        {
	            String modifiedSentence = sentence.substring(0, index) + replaceWord +
	                                       sentence.substring(index + searchWord.length());
	
	            System.out.println("\nOriginal Sentence: " + sentence);
	            System.out.println("Modified Sentence: " + modifiedSentence);
	        } 
        
        else 
	        {
	            System.out.println("\nThe word '" + searchWord + "' was not found in the sentence.");
	        }

        sc.close();
    }
}

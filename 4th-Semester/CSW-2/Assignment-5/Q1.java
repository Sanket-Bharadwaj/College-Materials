//Write a Java program that illustrates the difference between using 
//string literals and the new keyword for creating String objects. Your
//program should demonstrate the memory usage implications and how string 
//comparison behaves differently in each case.

package Assignment;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println("Comparing string literals (str1 == str2): " + (str1 == str2)); 
        System.out.println("Comparing string literal and new String (str1 == str3): " + (str1 == str3)); 
        System.out.println("Comparing two new String objects (str3 == str4): " + (str3 == str4)); 

        System.out.println("Comparing content of str1 and str3 (str1.equals(str3)): " + str1.equals(str3)); 
        System.out.println("Comparing content of str3 and str4 (str3.equals(str4)): " + str3.equals(str4)); 
    }
}

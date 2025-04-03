package q05;

import java.util.Scanner;
import java.util.HashMap;
public class Library  {
	static String searchBook(HashMap<Integer,Book>Library, String name)
	{
		for (Integer i:Library.keySet())
		{
			Book book = (Book)Library.get(i);
            if (book.getName().equals(name))
            {
            	return ("Book found\nBook ID:" +i+"\nBook Name: "+book.getName()+"\\nBook author: "+book.getAuthor()+"\nBook Quantity: "+book.getQuantity()+"\n");
            }
		}
		return ("Book not found");
		
	}
	static void displayLibrary(HashMap<Integer, Book> Library)
	{
		for (Integer i: Library.keySet())
		{
			Book book = (Book)Library.get(i);
			System.out.println("Book ID: "+i+"\nBook Name: "+book.getName()+"\nBook author:"+book.getAuthor()+"\nBook Quantity: "+book.getQuantity());
			System.out.println();
			
		}
	}
	static void displayBook(Book book)
	{
		System.out.println("Book ID: "+book.getId()+"\nBook Name: "+book.getName()+"\nBook author:"+book.getAuthor()+"\nBook Quantity: "+book.getQuantity());
		System.out.println();
	}
    public static void main (String args[])
    {
    	Scanner in = new Scanner(System.in);
	HashMap<Integer, Book> bookMap = new HashMap<Integer, Book>();
	Book book1 = new Book(123,1,"HP","JKR");
	Book book2 = new Book(456,2,"TCOMC","AD");
	Book book3 = new Book(789,1,"TFrank","MS");
	bookMap.put(book1.getId(), book1);
	bookMap.put(book2.getId(), book2);
	bookMap.put(book3.getId(), book3);
	displayLibrary(bookMap);
	System.out.println("Enter book name to search: ");
    String name = in.next();
    System.out.println(searchBook(bookMap,name));
    System.out.println("Enter book id to remove book: ");
    int idRem = in.nextInt();
    bookMap.remove(idRem);
    System.out.println("Book removed:");
    displayBook(bookMap.get(idRem));
    displayLibrary(bookMap);
    in.close();
}

}

package q02;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListUser 
{
	static void displayList(ArrayList <User> newList)
	{
		for (int i = 0;i<newList.size();i++)
		{
			System.out.println(newList.get(i).toString()+"\n");
		}
	}
  public static void main (String args[])
  {
	  ArrayList <User> newList = new ArrayList<User>();
	  User ob = new User("John",19);
	  User ob2 = new User("Amy", 23);
	  User ob3 = new User("Jason", 20);
	  newList.add(ob);
	  newList.add(ob2);
	  newList.add(ob3);
	  displayList(newList);
	  Collections.sort(newList);
	  System.out.println("Sorted by age");
	  displayList(newList);
      
  }
}

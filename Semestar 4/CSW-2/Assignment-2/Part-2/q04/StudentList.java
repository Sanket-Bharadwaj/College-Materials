package q04;

import java.util.LinkedList;
import java.util.Scanner;
public class StudentList 
{
	static void displayList(LinkedList<Student> newList)
	{
		for (int i = 0;i<newList.size();i++)
		{
			Student student = (Student) newList.get(i);
			System.out.println("Name: "+student.getName());
			System.out.println("Age: "+student.getAge());
			System.out.println("Marks: "+student.getMark());
			System.out.println();
		}
	}
	static String findStudent (LinkedList<Student> newList, Student elem)
	{
		for(int i = 0;i<newList.size();i++)
		{
			Student student = (Student)newList.get(i);
			if (student.equals(elem)==true)
			{
				return ("Student found");
			}
		}
		return ("Student not found");
	}
 public static void main (String args[])
 {
	 Scanner in = new Scanner(System.in);
	 Student ob = new Student("John", 13, 50);
	 Student ob2 = new Student("Amy", 12, 40);
	 Student ob3 = new Student("Peter", 13, 60);
	 LinkedList <Student> newList = new LinkedList<Student>();
	 newList.add(ob);
	 newList.add(ob2);
	 newList.add(ob3);
	 displayList(newList);
	 System.out.println("Enter name, age and marks of student to find and remove:");
	 String name = in.next();
	 int age = in.nextInt();
	 int marks = in.nextInt();
	 Student ob4 = new Student(name,age,marks);
	 System.out.println(findStudent(newList, ob4));
	 System.out.println(newList.contains(ob4));
	 newList.remove(1);
	 System.out.println("Total number of students: "+newList.size());
	 in.close();
 }
}

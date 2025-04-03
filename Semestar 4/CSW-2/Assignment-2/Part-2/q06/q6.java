package q06;

import java.util.Scanner;
import java.util.TreeSet;

public class q6 {

	public static void main(String[] args) {
		int x[] = { 1, 4, 4, 4, 5, 5, 6, 6, 7, 7, 8, 2, 2, 3, 5, 5, 8, 8, 9 };
		TreeSet<Integer> ob = new TreeSet<Integer>();
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < x.length; i++)
			ob.add(x[i]);
		// (a)
		for (Integer i : ob)
			System.out.print(i + " ");
		System.out.println();
		//(b)
		System.out.println("Enter a number to be searched:");
		int search=sc.nextInt();
		System.out.println(ob.contains(search));
		//(c)
		ob.remove(6);
		System.out.println("Element removed.");
		for (Integer i : ob)
			System.out.print(i + " ");
	}
}

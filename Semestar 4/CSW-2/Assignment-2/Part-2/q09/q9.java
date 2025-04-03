package q09;

import java.util.HashSet;
public class q9 {
public static void main (String args[])
{
	 int [] arr = {1,1,2,2,3,4,5,6,7,7};
	 HashSet <Integer> ob = new HashSet<Integer>();
	 HashSet <Integer> ob1 = new HashSet<Integer>();
	 for (int i = 0;i<arr.length;i++)
	 {
		 if (ob.contains(arr[i])==false)
		 {
			 ob.add(arr[i]);
		 }
		 else
		 {
			 ob1.add(arr[i]);
		 }
	 }
	 System.out.println(ob);
	 System.out.println(ob1);
   
}
}


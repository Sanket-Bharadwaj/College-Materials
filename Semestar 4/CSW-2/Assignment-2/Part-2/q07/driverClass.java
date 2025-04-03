package q07;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;
public class driverClass {
	public static void main (String args[])
	{
		TreeMap <String, Address> postal = new TreeMap<String, Address>();
		String person1 = "Daniel";
		Address add1 = new Address(32,"D3", 823412 );
		String person2 = "Michael";
		Address add2 = new Address(33,"D4", 823412 );
		String person3 = "Suniel";
		Address add3 = new Address(34,"D5", 823412 );
		postal.put(person1, add1);
		postal.put(person2, add2);
		postal.put(person3, add3);
		Set <Map.Entry<String, Address>> set1 = postal.entrySet();
		Iterator<Entry<String, Address>> itr = set1.iterator();
        while (itr.hasNext())
        {
        	Entry<String, Address> x = itr.next();
        	Address add = (Address) x.getValue();
        	System.out.println("Name: "+x.getKey());
        	System.out.println("PlotNo: "+add.getPlotNo()+"\nat: "+add.getAt()+"\nPost: "+add.getPost());
        	System.out.println();

        }
	}

}

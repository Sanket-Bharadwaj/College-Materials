package q08;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class checkAnagram {
	public static void main (String args[])
	{
		int flag = 0;
		char d;
		String s1 = "brag";
		String s2 = "grab";
		HashMap <Character, Integer> freq = new HashMap<Character, Integer>();
		for (int i = 0;i<s1.length();i++)
		{
			d = s1.charAt(i);
			if (freq.containsKey(d))
				freq.put(d, (freq.get(d)+1));
			else
				freq.put(d,1);
		}
        for(int i = 0;i<s2.length();i++)
        {
        	d = s2.charAt(i);
        	if (freq.containsKey(d))
        		freq.put(d, (freq.get(d)-1));
        }
        Set<Entry<Character, Integer>> entrySet = freq.entrySet();
        Iterator<Entry<Character, Integer>> itr = entrySet.iterator();
        while(itr.hasNext())
        {
        	Map.Entry <Character, Integer> ob = (Entry<Character, Integer>)itr.next();
        	if (ob.getValue().equals(0)==false)
        			{
        		      flag = 1;
        		      break;
        			}
        }
        if (flag>0)
        {
        	System.out.println("Strings are not an anagram");
        }
        else 
        	System.out.println("Strings are anagrams");
	}

}

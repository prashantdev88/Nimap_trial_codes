package collections;

import java.util.Hashtable;
import java.util.Vector;

public class Collection_Demo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(1212);
		v.add(4545);
		System.out.println(v.get(1));
		
		Hashtable<Integer,String> h = new Hashtable<Integer, String>();
		h.put(1,"QQQQ");
		h.put(2,"EEE");
		h.put(3,"TTTTT");
		System.out.println(h.get(1));
		System.out.println(h.remove(2, "EEE"));
		System.out.println(h.get(2)); // get value by KEY
		System.out.println(h.keySet()); // Return Array of Keys [3, 1]
		System.out.println(h.contains("TTTTT")); // return true if Specified KEY is present
		
	
	}
}

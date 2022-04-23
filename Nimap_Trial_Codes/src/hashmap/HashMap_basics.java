package hashmap;

// HashMap                   Hashtable

//Allows Multiple Null         No null Allowed
//No Insertion order followed    No insertion order followed in Hashtable

import java.util.HashMap;
import java.util.Hashtable;

public class HashMap_basics {

	public static void main(String[] args) {
		HashMap<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(1,"AAAA");
		m1.put(2,"BBBB");
		m1.put(3,"CCCC");
		m1.put(4,"DDDD");
		m1.put(null, null);
		m1.put(21, null);
		m1.put(11, null);
		
		System.out.println(m1);
		System.out.println(m1.containsKey(1)); // return true if key is Mapped
		System.out.println(m1.get(2));   // Return Value of specified Key
		
		m1.put(4,"SSSSS"); // replace the value of speficied key and adds if not present then it is added in the list
		m1.put(5, "PPPP");
		System.out.println(m1);
		m1.replace(5, "PPPP","WSWSW"); // replaces the value if it is mapped and matched with OLD value
		System.out.println(m1);
		System.out.println(m1.size()); // returns the SIZE of the HashMAP
		System.out.println(m1.entrySet());
		
//		***********************************
		
		
		Hashtable<Integer,String> t1 = new Hashtable<Integer,String>();
		t1.put(1, "Car");
		t1.put(2,"Car1");
		t1.put(3,"Car1");
		t1.put(4,"Car1");
		
		
		System.out.println(t1.contains("Car3")+"%"); // return true if Specfied Key is maped in the TABLE
		System.out.println(t1.containsKey(1)); // return true if the key is maped in hashtable
		System.out.println(t1.size());
		System.out.println(t1.getOrDefault(1,"CAD")+"%%"); // if the key has value then that is returned else if key is not present then CAD will be returned 
		System.out.println(t1.getOrDefault(11,"CAD")+"^%");
		System.out.println(t1.entrySet());   //[4=Car1, 3=Car1, 2=Car1, 1=Car]
		System.out.println(t1);              //{4=Car1, 3=Car1, 2=Car1, 1=Car}
		System.out.println(	t1.elements()); //java.util.Hashtable$Enumerator@5f184fc6
		
	}
}

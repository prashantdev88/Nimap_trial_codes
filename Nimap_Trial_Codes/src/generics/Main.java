package generics;


// The GenericList<T> CLASS can have any template (Integer,User,etc) the this class has 2 methods add elements to Array and getElements by Index Value 

// 

public class Main {

	public static void main(String[] args) {
		GenericList<Integer> arr = new GenericList<Integer>();
		arr.add(12120);
		System.out.println(arr.get(0));
		
		User obj = new User(12);
		User obj1 = new User(122);
		User obj2 = new User(522);
		User obj3 = new User(722);
		
		System.out.println(obj.compareTo(obj1));
		System.out.println(obj.toString());
		System.out.println(obj1.toString());
//		System.out.println(compareWith(obj, obj1)+" $");
		System.out.println(compareWith(obj3, obj2)+" $");
	}
	
	public static <T extends Comparable<T>>T compareWith(T first,T second) {
//		System.out.println(second.compareTo(first));
//		System.out.println(first.compareTo(second));
		return (first.compareTo(second) > 0) ? first : second;
		
	}
}

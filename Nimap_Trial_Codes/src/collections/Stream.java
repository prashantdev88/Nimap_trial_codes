package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		
		List<Integer> arL = Arrays.asList(22,33,44,55,66,77);
		List<Integer> arL1 = arL.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(arL1);
		
		// Finding elements that start with "S"
		List<String> names = Arrays.asList("Sqqw","Swewe","pppdfe","vvcv");
		List<String> custom = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		System.out.println(custom);
		
		
		//Give Only Unique Elements 
		List<String> persons = Arrays.asList("Sasa","Sasa","Psdss","Psdss","EEEE","sxcxc");
		List<String> res = persons.stream()
		            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		            .entrySet()
		            .stream()
		            .filter(e -> e.getValue() == 1)
		            .map(e -> e.getKey())
		            .collect(Collectors.toList());

	    System.out.println(res);

	    // Sorts The Elements in the List
	    List<String> arList = Arrays.asList("AAA","BBB","ZZZ","EEEE","DDDD","XXXX");
	    List<String> sorted = arList.stream().sorted().collect(Collectors.toList());
	    System.out.println(sorted);
	    
	    // Will get Even NUmbers And Adds THEM
	    List<Integer> number = Arrays.asList(12,3,4,5);
	    int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
	    System.out.println(even);
	    
	    // Will print numbers by Squaring it 
	    System.out.println("**********************");
	    number.stream().map(x->x*x).forEach(y->System.out.println(y));
	    
	    // Will get even number list
	    List<Integer> even1 = number.stream().filter(n->n%2==0).collect(Collectors.toList());
	    System.out.println(even1);

	    // Counts the elements of the list by numbers
	    List<String> g = Arrays.asList("geeks", "for", "geeks");
	    Map<String, Long> result = g.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    	System.out.println(result);

	    // Counts the elements of the list by numbers    	
    	List<Integer> numList = Arrays.asList(22,22,55,66,66,88,88,88,88,100,100);
    	Map<Integer,Long> countNum = numList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    	System.out.println(countNum);
    	
    	
	}
	
	
	
}

package collections;

// Slicing & Partition the Stream

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {

	public static <T> Stream<T>
    getSliceOfStream(Stream<T> stream, int startIndex, 
                                          int endIndex)
    {
		// skip will determine start and limit will determine how many elements will stream contain 
        return stream.skip(startIndex).limit(endIndex - startIndex + 1);
    }
    public static void main(String[] args)
    {
  
        // Create a new List with values 11 - 20
        List<Integer> list = new ArrayList<>();
        for (int i = 11; i <= 20; i++)
            list.add(i);
  
        // Create stream from list
        Stream<Integer> intStream = list.stream();
  
        // Print the stream
        System.out.println("List: " + list);
  
        // Get Slice of Stream
        // containing of elements from the 4th index to 8th
        Stream<Integer> sliceOfIntStream = getSliceOfStream(intStream, 4, 8);
  
        // Print the slice
        System.out.println("\nSlice of Stream:");
        sliceOfIntStream.forEach(System.out::println);
        
        
        //Partition the STREAM
        Stream<Integer> st1 = Stream.of(1,2,3,4,5,6,7,8,9);
        Map<Boolean,List<Integer>> m1 = st1.collect(Collectors.partitioningBy(number -> number > 3));
        System.out.println(m1);
        
        List<Integer> list22 = Arrays.asList(0, 2, 4, 6, 8, 10);
        list22.stream().peek(System.out::println);
    }
}

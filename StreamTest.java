package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	
	public static void main(String[] args) {
		
		
		IntStream.of(3, 2, 2, 3, 7, 3, 5)
        .distinct()
        .forEach(n -> System.out.println(n + "\t" +(int)Math.pow(n, 2)));

		
		/*
		 * List<String> list = Stream.of("Monkey", "Lion", "Giraffe","Lemur") .filter(s
		 * -> s.startsWith("L")) .map(String::toUpperCase) .sorted() .collect(toList());
		 * System.out.println(list);
		 */
		
		
		 String s = "aayanna";
		   long c= s.chars()
	        .distinct()
	        .count();
		   
		   System.out.println(c);
		   
		   String[] input = {"This", "is", "This", "not"};
		   System.out.println(Stream.of(input)
		           .map(w -> w.split(""))
		           .flatMap(Arrays::stream)
		           .distinct()
		           .collect(Collectors.toList()));
			
			
	}

}

package com.streams;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import java.util.Map;

import java.util.function.Function;

import java.util.stream.Collectors;

public class DiscnictCharacter

{

	public static void main(String[] args) {



    	Collection<String> list = Arrays.asList("aaryanna", "aayanna", "airianna", "alassandra", "allanna", "allannah", "allessandra");

		String prefix ="aa";

        List<String> c = list.stream().filter(e -> e.startsWith(prefix)).collect(Collectors.toList());



       c.stream().distinct().forEach(b -> System.out.println(b+b.chars().distinct().count() ));





        

	}

}
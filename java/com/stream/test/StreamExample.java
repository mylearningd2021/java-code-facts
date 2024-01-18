package com.stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		Optional<Integer> first = myList.stream().filter(s->s%2==0).findFirst();
		
		if(first.isPresent())
		{
			System.out.println(first.get());
		}
		
		
	}

}

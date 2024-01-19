package com.streamquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(2, 34, 678, 3));

		List<Integer> newList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(newList);

	}

}

package com.streamquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsFilter {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("Laxmi Prasad", "Narasimha", "Shweta", "Ram", "pb", "mb"));

		String lessThan3 = list.stream().filter(i -> i.length() < 3)
				.collect(Collectors.joining(","));

		String greaterThan3 = list.stream().filter(str -> str.length() >= 3)
				.map(str -> str.toUpperCase())
				.collect(Collectors.joining(","));

		System.out.println(lessThan3 +","+ greaterThan3);

	}

}

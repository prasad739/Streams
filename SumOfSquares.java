package com.streamquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfSquares {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(4, 33, 2, 6));

	Integer rslt = list.stream()
		.filter(i -> i % 2 == 0)
		.map(i -> i * i)
		.reduce((a,b)->a+b).get();
		
		System.out.println(rslt);

	}
}

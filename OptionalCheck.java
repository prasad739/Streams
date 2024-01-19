package com.streamquestions;

import java.util.Optional;

public class OptionalCheck {

	public static int stringLength(String str) {

		Optional<String> stringCheck = Optional.ofNullable(str);

		if (stringCheck.isEmpty()) {
			return 0;
		} else {
			return stringCheck.get().length();
		}

	}

	public static void main(String[] args) {
		
		System.out.println(OptionalCheck.stringLength(null));

	}

}

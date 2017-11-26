package com.hellokoding.springboot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class ScramblerService {

	public String scramble(String str) {
		Random r = new Random();
		String res = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			int index = r.nextInt(str.length());
			res += str.charAt(index);
			str = str.substring(0, index) + str.substring(index + 1);
		}
		return res;
		// List<String> chars = Arrays.asList(str.split(""));
		// Collections.shuffle(chars);
		// return String.join("", chars);
	}
	
}

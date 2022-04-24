package com.projectz.back.service.utils;

import java.util.Random;

public class NumberUtils {
	
	
	public static int generateRandomNumber(int low , int high) {
		Random r = new Random();
		
		int result = r.nextInt(high-low) + low;
		return result;
	}

}

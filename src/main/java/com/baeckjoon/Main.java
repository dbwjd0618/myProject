package com.baeckjoon;

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
	
		/**
		 * baekjoon
		 * a b  c  d e  f  g  h  i j k  l  m n o  p  q  r  s  t  u  v  w  x  y  z
		 * 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
		 */
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		// 26개
		String[] arr = new String[26];
		char c = ' ';
		int j = 0;
		for(char i = 97; i < 123; i ++) {
			c = i;
			arr[j] = String.valueOf(c);
			j ++;
		}
		
		String result = "";
		for(int m = 0; m < arr.length; m ++) {
			String alpha = arr[m];
			
			if(word.contains(alpha)) {
				arr[m] = String.valueOf(word.indexOf(alpha));
			} else {
				arr[m] = "-1";
			}
			result += arr[m] + " ";
		}
		System.out.println(result.trim());
		sc.close();
	}
}
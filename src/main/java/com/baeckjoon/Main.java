package com.baeckjoon;

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
	
		/**
		 * 2
		 * 3 ABC
		 * 5 /HTP
		 */
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String word = "";
		String result = "";
		for(int i = 0; i < N; i ++) {
			int R = sc.nextInt();
			word = sc.next();
			
			for(int j = 0; j < word.length(); j ++) {
				char c = word.charAt(j);
				for(int k = 0; k < R; k ++) {
					result += c;
				}
			}
			result += "\r\n";
		}
		System.out.print(result.trim());
		sc.close();
	}
}
package com.baeckjoon;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next().toUpperCase();
		
		int[] cnt = new int[26];
		
		for(int i = 0; i < word.length(); i ++) {
			int num = word.charAt(i) - 'A';
			cnt[num]++;
		}
		
		int max = 0;
		char result = '?';
		for(int j = 0; j < cnt.length; j++) {
			if(max < cnt[j]) {
				max = cnt[j];
				result = (char)(j+'A');
			} else if(max == cnt[j]) {
				result = '?';
			}
		}
		System.out.println(result);
		sc.close();
	}
}
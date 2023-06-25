package com.baeckjoon.problems;

import java.util.Scanner;

public class StringProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		stringTonumbersSum(sc);	// 11720. 숫자의 합
        searchAlphabet(sc);		// 10809. 알파벳 찾기
	}

	private static void searchAlphabet(Scanner sc) {
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

	private static void stringTonumbersSum(Scanner sc) {
		int N = sc.nextInt();
		String sentence = sc.next();
		
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += sentence.charAt(i)-48;
		}
		
		System.out.println(sum);
	}
}

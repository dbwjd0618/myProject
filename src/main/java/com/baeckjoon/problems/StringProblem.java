package com.baeckjoon.problems;

import java.util.Scanner;

public class StringProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		stringTonumbersSum(sc);	// 11720. 숫자의 합
        searchAlphabet(sc);		// 10809. 알파벳 찾기
        repeatWord(sc);			// 2675. 문자열 반복
	}

	/**
	 * 2
	 * 3 ABC
	 * 5 /HTP
	 * 
	 * AAABBBCCC
	 * /////HHHHHTTTTTPPPPP
	 */
	private static void repeatWord(Scanner sc) {
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

	/**
	 * baekjoon
	 * a b  c  d e  f  g  h  i j k  l  m n o  p  q  r  s  t  u  v  w  x  y  z
	 * 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
	 * @param sc
	 */
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

	/**
	 * 입력으로 주어진 숫자 N개의 합을 출력한다.
	 * 
	 * 5
	 * 54321 -> 15
	 */
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

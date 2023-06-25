package com.baeckjoon.problems;

import java.util.Scanner;

public class StringProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		stringTonumbersSum(sc);		// 11720.숫자의 합
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

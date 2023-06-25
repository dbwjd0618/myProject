package com.baeckjoon.solutions;

import java.util.Scanner;

public class StringSolution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		repeatWord(sc);			// 2675. 문자열 반복
	}

	// 구글링 답변이나, 성공 이유를 모르겠음(백준 질문. 답변 대기중)
	/**
	 * 실행결과
	 * 2
	 * 3 ABC
	 * 5 /HTPAAABBBCCC
	 * 
	 * /////HHHHHTTTTTPPPPP
	 */
	private static void repeatWord(Scanner sc) {
		int N = sc.nextInt();
		for(int i = 0; i < N; i ++) {
			
			int R = sc.nextInt();
			String word = sc.next();
			
			for(int j = 0; j < word.length(); j ++) {
				for(int k = 0; k < R; k ++) {
					System.out.print(word.charAt(j));
				}
			}
			System.out.println();
		}
		sc.close();
	}
}

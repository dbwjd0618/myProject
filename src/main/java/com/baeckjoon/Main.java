package com.baeckjoon;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 문자를 받아 배치할 2차원 배열을 선언
		char[][] wordArr = new char[5][15];
		int maxLength = 0;
		for(int i = 0; i < wordArr.length; i ++) {
			// 2-1. 문자를 직접 입력받기
			String str = sc.next();
			// 2-2. 입력될 한 행의 문자열 개수 담기
			maxLength = Math.max(maxLength, str.length());
			// 2-3. 입력받은 문자 배열에 배치
			for(int j = 0; j < maxLength; j ++)
				wordArr[i][j] = str.charAt(j);
		}
		// 3. 배열에서 문자를 세로로 출력
		for(int i = 0; i < maxLength; i ++) {
			for(int j = 0; j < wordArr.length; j++) {
				if(wordArr[j][i] == '\0') continue;
				System.out.print(wordArr[j][i]);
			}
		}
		sc.close();
	}
}
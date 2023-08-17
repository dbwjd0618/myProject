package com.baeckjoon.problems;

import java.util.Scanner;

public class TwoArrayProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		calMatrix(sc);		// 2738. 행렬 덧셈
		maxValue(sc);		// 2566. 최댓값
		readToHeight(sc);	// 10798. 세로읽기
	}

	private static void readToHeight(Scanner sc) {
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

	private static void maxValue(Scanner sc) {
		int[][] arr1 = new int[9][9];
		int max = 0;
		
		for(int i = 0; i < arr1.length; i ++) {
			String line = sc.nextLine();
			for(int j = 0; j < arr1[i].length; j ++) {
				max = max > Integer.parseInt(line.split(" ")[j]) ? max : Integer.parseInt(line.split(" ")[j]); 
				arr1[i][j] = Integer.parseInt(line.split(" ")[j]);
			}
		}
		
		System.out.println(max);
		boolean ynOut = false;
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				if(arr1[i][j] == max) {
					ynOut = true;
					System.out.print((i+1) + " " + (j+1));
				}
				if(ynOut) break;
			}
			if(ynOut) break;
		}
		sc.close();
	}

	private static void calMatrix(Scanner sc) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		sc.nextLine();
		
		int[][] arr1 = new int[N][M];
		int[][] arr2 = new int[N][M];
		
		for(int i = 0; i < N; i ++) {
			String line = sc.nextLine();
			for(int j = 0; j < M; j ++)
				arr1[i][j] = Integer.parseInt(line.split(" ")[j]);
		}
		
		for(int i = 0; i < N; i ++) {
			String line = sc.nextLine();
			for(int j = 0; j < M; j ++)
				arr2[i][j] = Integer.parseInt(line.split(" ")[j]);
		}
		
		for(int i = 0; i < N; i ++) {
			for(int j = 0; j < M; j ++)
				System.out.print(arr1[i][j] + arr2[i][j] + " ");
			System.out.println();
		}
		sc.close();
	}
}

package com.baeckjoon.problems;

import java.util.Scanner;

public class Deepen1Problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		chess(sc); 			// 3003. 킹, 퀸, 룩, 비숍, 나이트, 폰 
		printStars(sc);		// 2444. 별 찍기 - 7
		palindrome(sc);		// 10988. 팰린드롬인지 확인하기
	}

	private static void palindrome(Scanner sc) {
		String orgWord = sc.next();
		
		StringBuffer sb = new StringBuffer(orgWord);
		String newWord = sb.reverse().toString();
		
		if(orgWord.equals(newWord))
			System.out.println("1");
		else
			System.out.println("0");
	}

	private static void printStars(Scanner sc) {
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < n-i; j++) 
				System.out.print(" ");
			for(int j = 0; j < i*2-1; j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i = n-1; i >= 1; i--) {
			for(int j = 0; j < n-i; j ++) 
				System.out.print(" ");
			for(int j = 0; j < i*2-1; j++)
				System.out.print("*");
			System.out.println();
		}
		
		sc.close();
	}

	private static void chess(Scanner sc) {
		int arr[] = {1, 1, 2, 2, 2, 8};
		
		for(int i = 0; i < arr.length; i ++) {
			int len = sc.nextInt();
			int sub = arr[i] - len;
			
			if(i == arr.length-1)
				System.out.print(sub);
			else
				System.out.print(sub + " ");
		}
		sc.close();
	}
		
}

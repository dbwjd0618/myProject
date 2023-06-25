package com.baeckjoon;

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {

		/**
		 * 1152. 단어의 개수
		 * The Curious Case of Benjamin Button -> 6
		 */
		Scanner sc = new Scanner(System.in);
		String content = sc.nextLine().trim();
		String[] arr = content.split(" ");
		
		if(arr.length == 1 && "".equals(arr[0]))
			System.out.println(0);
		else
			System.out.println(arr.length);
		
		sc.close();
	}
}


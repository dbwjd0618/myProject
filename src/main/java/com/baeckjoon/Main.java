package com.baeckjoon;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {

		/**
		 * 1152. 단어의 개수
		 * The Curious Case of Benjamin Button -> 6
		 */
		Scanner sc = new Scanner(System.in);
		String content = sc.next();
		
		String[] arr = null;
		arr = content.split(" ");
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
		sc.close();
	}
}
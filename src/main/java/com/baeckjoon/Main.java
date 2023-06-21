package com.baeckjoon;

import java.util.Scanner;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] students = new int[31];
		for(int j = 0; j < 28; j ++) {
			int submited = sc.nextInt();
			students[submited] = 1;
		}
		
		for(int i = 1; i < students.length; i ++) {
			if(students[i] != 1) {
				System.out.println(i);
			}
		}
		
	}
}

package com.baeckjoon.solutions;

import java.util.Scanner;

public class ArraySolution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		missTask(sc);	// 5597. 과제 안내신 분
	}

	// 타인 답안
	private static void missTask(Scanner sc) {
		int[] student = new int[31];
		
		for(int i=1; i<29; i++) {
			int success = sc.nextInt();
			student[success] = 1;
		}
		for(int i=1; i<student.length; i++) {
			if(student[i]!=1)
				System.out.println(i);
		}
		sc.close();
	}
}

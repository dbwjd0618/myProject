package com.baeckjoon.solutions;

import java.util.Scanner;

/**
 * 직접 푼 문제가 실패시 성공한 타인 답안을 작성
 */
public class ArraySolution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		missTask(sc); // 5597. 과제 안내신 분
		backetsReverse(sc); // 10811. 바구니 뒤집기
	}

	// 타인 답안
	private static void backetsReverse(Scanner sc) {
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) { // 기본배열 생성
			arr[i] = i + 1;
		}

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int order1 = sc.nextInt() - 1;
			int order2 = sc.nextInt() - 1;

			while (order1 < order2) {
				int temp = arr[order1];
				arr[order1++] = arr[order2];
				arr[order2--] = temp;
			}

		}
		String ret = "";
		for (int j = 0; j < arr.length; j++) {
			ret += arr[j] + " ";
		}
		System.out.print(ret.trim());
		sc.close();
	}

	// 타인 답안
	private static void missTask(Scanner sc) {
		int[] student = new int[31];

		for (int i = 1; i < 29; i++) {
			int success = sc.nextInt();
			student[success] = 1;
		}
		for (int i = 1; i < student.length; i++) {
			if (student[i] != 1)
				System.out.println(i);
		}
		sc.close();
	}
}

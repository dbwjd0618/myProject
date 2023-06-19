package com.baeckjoon;

import java.util.Scanner;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/**
		 * 처음 바구니에 들어있는 공의 숫자는 바구니의 번호와 같다.
		 * 5 4 : N(바구니의 개수) M:(섞을 횟수)
		 * 1 2 : 2 1 3 4 5
		 * 3 4 : 2 1 4 3 5
		 * 1 4 : 3 1 4 2 5
		 * 2 2 : 3 1 4 2 5
		 */
		Scanner sc = new Scanner(System.in);
		String[] terms = sc.nextLine().split(" ");
		int N = Integer.parseInt(terms[0]);
		int M = Integer.parseInt(terms[1]);
		
		int[] baskets = new int[N];
		for(int i = 0; i < baskets.length; i ++) {
			baskets[i] = i+1;
		}
		
		for(int j = 1; j <= M; j ++) {
			String[] arr = sc.nextLine().split(" ");
			int bskStart = Integer.parseInt(arr[0]) - 1;
			int bskEnd = Integer.parseInt(arr[1]) - 1;
			
			int org = baskets[bskStart];
			baskets[bskStart] = baskets[bskEnd];
			baskets[bskEnd] = org;
		}
        for(int k = 0; k < baskets.length; k++) {
            System.out.print(baskets[k] + " ");
        }
	}
}

package com.baeckjoon;

import java.util.Scanner;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/**
		 * 5 4		: N(바구니의 개수) M(바구니에 공을 넣을 횟수)
		 * 1 2 3	: 1~2번 바구니에 3번 공(3 3 0 0 0) 
		 * 3 4 4	: 3~4번 바구니에 4번 공(3 3 4 4 0)
		 * 1 4 1	: 1~4번 바구니에 1번 공(1 1 1 1 0)
		 * 2 2 2	: 2번 바구니에 2번 공(1 2 1 1 0)
		 */
		Scanner sc = new Scanner(System.in);
		String[] terms = sc.nextLine().split(" ");
		int N = Integer.parseInt(terms[0]);
		int M = Integer.parseInt(terms[1]);
		
		int[] baskets = new int[N];
		int bskStart = 0;
		int bskEnd = 0;
		int numBall = 0;
		
		for(int i = 0; i < M; i ++) {
			String[] arr = sc.nextLine().split(" ");
			bskStart = Integer.parseInt(arr[0]);
			bskEnd = Integer.parseInt(arr[1]);
			numBall = Integer.parseInt(arr[2]);
			
			for(int j = bskStart-1; j <= bskEnd-1; j ++) {
				baskets[j] = numBall;
			}
		}
        for(int k = 0; k < baskets.length; k++) {
            System.out.print(baskets[k] + " ");
        }
	}
}

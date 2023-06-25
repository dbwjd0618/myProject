package com.baeckjoon;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		/**
		 * 10811.i~j번까지의 바구니를 역순으로 정렬
		 * 5 4 : N(바구니), M(횟수)
		 * 1 2 : 2 1 3 4 5
		 * 3 4 : 2 1 4 3 5
		 * 1 4 : 3 4 1 2 5
		 * 2 2 : 3 4 1 2 5
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] backets = new int[sc.nextInt()];
		for(int i = 0; i < backets.length; i ++) {
			backets[i] = i+1;
		}
		
		int M = sc.nextInt();
		for(int j = 0; j < M; j ++) {
			int s = sc.nextInt() - 1;
			int e = sc.nextInt() - 1;
			
			while(s < e) {
				int tmp = backets[s];
				backets[s++] = backets[e];
				backets[e--] = tmp;
			}
		}
		
		String result = "";
		for(int k = 0; k < backets.length; k ++) {
			result += backets[k] + " ";
		}
		System.out.println(result.trim());
		sc.close();
	}
}

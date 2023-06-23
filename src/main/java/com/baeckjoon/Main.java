package com.baeckjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	@SuppressWarnings("resource")
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
		String[] terms = sc.nextLine().split(" ");
		int N = Integer.parseInt(terms[0]);
		int M = Integer.parseInt(terms[1]);
		
		int[] backets = new int[N];
		int[] tmp = new int[N];
		
		// 최초 데이터 세팅
		for(int i = 0; i < N; i ++) {
			backets[i] = i+1;
		}
		
		tmp = backets;
		for(int j = 0; j < M; j ++) {
			String[] section = sc.nextLine().split(" ");
			int start = Integer.parseInt(section[0])-1;
			int end = Integer.parseInt(section[1])-1;
			
			if(end-start > 1) {
				for(int k = 0; k <= end-start; k ++) {
					backets[k] = tmp[end-k];
				}
			} else {
				backets[start] = tmp[end];
				backets[end] = tmp[start];
			}
		}
		
		System.out.println(Arrays.toString(backets));
	}
}

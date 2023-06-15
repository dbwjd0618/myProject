package com.baeckjoon;

import java.util.ArrayList;
import java.util.List;
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

		int M = sc.nextInt();
		sc.nextLine();
		
		List<String> list = new ArrayList<>();
		for(int i = 0; i < M; i ++) {
			String s = sc.nextLine();
			list.add(s);
			
			String[] arr = list.get(i).split(" ");
		}
		
		System.out.println(list.toString());
	}
}

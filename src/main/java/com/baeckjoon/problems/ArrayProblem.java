package com.baeckjoon.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		countUp(sc);	// 10807. 개수 세기
		putBall(sc);	// 10810. 공 넣기
	}

	/**
	 * 5 4		: N(바구니의 개수) M(바구니에 공을 넣을 횟수)
	 * 1 2 3	: 1~2번 바구니에 3번 공(3 3 0 0 0) 
	 * 3 4 4	: 3~4번 바구니에 4번 공(3 3 4 4 0)
	 * 1 4 1	: 1~4번 바구니에 1번 공(1 1 1 1 0)
	 * 2 2 2	: 2번 바구니에 2번 공(1 2 1 1 0)
	 */
	private static void putBall(Scanner sc) {
		
	}

	/**
	 * 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
	 */
	private static void countUp(Scanner sc) {
		int N = sc.nextInt();
		List<String> list = new ArrayList<>();
		
		for(int i = 0; i < N; i ++) {
			list.add(sc.next());
		}
		
		int v = sc.nextInt();
		int cnt = 0;
		
		for(int j = 0; j < list.size(); j++) {
			if(Integer.parseInt(list.get(j)) == v)
				++ cnt;
		}
		System.out.println(cnt);
	}
	
}
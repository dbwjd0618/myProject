package com.baeckjoon.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		receipt(sc);			// 25304. 영수증
		codingIsSporting(sc);	// 25314. 코딩은 체육과목 입니다
	}
	
	/**
	 *  4 : long int
	 *  8 : long long int
	 * 12 : long long long int
	 * 16 : long long long long int
	 * 20 : long long long long long int
	 */
	private static void codingIsSporting(Scanner sc) {
		int N = sc.nextInt();
		String forString = "long";
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < N/4; i ++) {
			sb.append(forString);
			sb.append(" ");
		}
		sb.append("int");
		System.out.println(sb);
	}

	/**
	 * 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.
	 * 
	 * 영수증에 적힌 총 금액 : X
	 * 영수증에 적힌 구매한 물건의 종류의 수 : N
	 * 이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어짐
	 */
	public static void receipt(Scanner sc) {
		long amount = sc.nextLong();
		int kindOfCnt = sc.nextInt();
		
		List<String> itemList = new ArrayList<>();
		long price = 0;
		int cnt = 0;
		long sum = 0;
		String[] itemInfoArr;
		
		sc.nextLine();
		for(int i = 0; i < kindOfCnt; i ++) {
			itemList.add(sc.nextLine());
			itemInfoArr = itemList.get(i).split(" ");
			price = Long.parseLong(itemInfoArr[0]);
			cnt = Integer.parseInt(itemInfoArr[1]);
			
			sum += price * cnt;
		}
		
		if(amount == sum) System.out.println("Yes");
		else System.out.println("No");
	}
}
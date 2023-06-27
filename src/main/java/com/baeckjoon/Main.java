package com.baeckjoon;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		/**
		 * 2908. 상수
		 * 입력받은 각 숫자를 거꾸로 뒤집은 후에 값을 비교하여 큰값을 출력
		 * 734 893 -> 437
		 */
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		StringBuffer sb1 = new StringBuffer(s1);
		int reverse1 = Integer.parseInt(sb1.reverse().toString());
		
		StringBuffer sb2 = new StringBuffer(s2);
		int reverse2 = Integer.parseInt(sb2.reverse().toString());

		int result = reverse1 > reverse2 ? reverse1 : reverse2;
		
		System.out.println(result);
		
		sc.close();
	}
}


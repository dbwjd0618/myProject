package com.baeckjoon.problems;

import java.util.Scanner;

public class StringProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		stringTonumbersSum(sc);	// 11720. 숫자의 합
        searchAlphabet(sc);		// 10809. 알파벳 찾기
        repeatWord(sc);			// 2675. 문자열 반복
        countOfWord(sc);		// 1152. 단어의 개수
        constantNumber(sc);		// 2908. 상수
        timeToDial(sc);			// 5622. 다이얼
	}

	private static void timeToDial(Scanner sc) {
		String word = sc.nextLine().toUpperCase();
		
		int count = 0;
		for(int i = 0; i < word.length(); i ++) {
			char alphabet = word.charAt(i);

			switch(alphabet) {
			case 'A' : case 'B' : case 'C' :
				count += 3;
				break;
				
			case 'D' : case 'E' : case 'F' : 
				count += 4;
				break;
			case 'G' : case 'H' : case 'I' : 
				count += 5;
				break;
			case 'J' : case 'K' : case 'L' : 
				count += 6;
				break;
			case 'M' : case 'N' : case 'O' : 
				count += 7;
				break;
			case 'P' : case 'Q' : case 'R' : case 'S' : 
				count += 8; 
				break;
			case 'T' : case 'U' : case 'V' : 
				count += 9;
				break;
			case 'W' : case 'X' : case 'Y' : case 'Z' : 
				count += 10; 
				break;
				
			}
		}
		System.out.println(count);
		sc.close();
	}

	/**
	 * 입력받은 각 숫자를 거꾸로 뒤집은 후에 값을 비교하여 큰값을 출력
	 * 734 893 -> 437
	 */
	private static void constantNumber(Scanner sc) {
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

	/**
	 * The Curious Case of Benjamin Button -> 6
	 * " " -> 0
	 */
	private static void countOfWord(Scanner sc) {
		String content = sc.nextLine().trim();
		String[] arr = content.split(" ");
		
		
		if(arr.length == 1 && "".equals(arr[0]))
			System.out.println(0);
		else
			System.out.println(arr.length);
		
		sc.close();		
	}

	/**
	 * 2
	 * 3 ABC
	 * 5 /HTP
	 * 
	 * AAABBBCCC
	 * /////HHHHHTTTTTPPPPP
	 */
	private static void repeatWord(Scanner sc) {
		int N = sc.nextInt();
		
		String word = "";
		String result = "";
		for(int i = 0; i < N; i ++) {
			int R = sc.nextInt();
			word = sc.next();
			
			for(int j = 0; j < word.length(); j ++) {
				char c = word.charAt(j);
				for(int k = 0; k < R; k ++) {
					result += c;
				}
			}
			result += "\r\n";
		}
		System.out.print(result.trim());
		sc.close();
	}

	/**
	 * baekjoon
	 * a b  c  d e  f  g  h  i j k  l  m n o  p  q  r  s  t  u  v  w  x  y  z
	 * 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
	 * @param sc
	 */
	private static void searchAlphabet(Scanner sc) {
		String word = sc.nextLine();
		
		// 26개
		String[] arr = new String[26];
		char c = ' ';
		int j = 0;
		for(char i = 97; i < 123; i ++) {
			c = i;
			arr[j] = String.valueOf(c);
			j ++;
		}
		
		String result = "";
		for(int m = 0; m < arr.length; m ++) {
			String alpha = arr[m];
			
			if(word.contains(alpha)) {
				arr[m] = String.valueOf(word.indexOf(alpha));
			} else {
				arr[m] = "-1";
			}
			result += arr[m] + " ";
		}
		System.out.println(result.trim());
		sc.close();
	}

	/**
	 * 입력으로 주어진 숫자 N개의 합을 출력한다.
	 * 
	 * 5
	 * 54321 -> 15
	 */
	private static void stringTonumbersSum(Scanner sc) {
		int N = sc.nextInt();
		String sentence = sc.next();
		
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += sentence.charAt(i)-48;
		}
		
		System.out.println(sum);
	}
}

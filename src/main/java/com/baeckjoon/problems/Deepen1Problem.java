package com.baeckjoon.problems;

import java.util.Scanner;

public class Deepen1Problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		chess(sc); 			// 3003. 킹, 퀸, 룩, 비숍, 나이트, 폰 
		printStars(sc);		// 2444. 별 찍기 - 7
		palindrome(sc);		// 10988. 팰린드롬인지 확인하기
		studyingVoca(sc);	// 1157. 단어 공부
		croatiaAlphabet(sc);// 2941. 크로티아 알파벳
		groupChecker(sc);	// 1316. 그룹 단어 체커
		averageScore(sc);	// 25206. 평점 구하기
	}

	private static void averageScore(Scanner sc) {
		double sumAver = 0.0;
		double sumScore = 0.0;
		double averScore = 0.0;
		for(int i = 0; i < 20; i++) {
			String scoreBySub = sc.nextLine();
			String[] scores = new String[3];
			scores = scoreBySub.split(" ");
			double score = Double.parseDouble(scores[1]);
			double averGrade = convertToDouble(scores[2]);
			
			if(!"P".equals(scores[2])) {
				sumScore += score;
				double multiScore = score * averGrade;
				sumAver += multiScore;
			}
		}
		averScore = sumAver/sumScore;
		System.out.println(Math.round(averScore*1000000)/1000000.0);
		sc.close();
	}

	private static double convertToDouble(String grade) {
		switch(grade) {
			case "A+" : return 4.5; 
			case "A0" : return 4.0; 
			case "B+" : return 3.5; 
			case "B0" : return 3.0; 
			case "C+" : return 2.5; 
			case "C0" : return 2.0; 
			case "D+" : return 1.5; 
			case "D0" : return 1.0; 
			default : return 0.0;
		}
	}
	
	private static void groupChecker(Scanner sc) {
		int N = sc.nextInt();
		int cnt = 0;
		for(int n = 0; n < N; n++) {
			String word = sc.next();
			boolean ynGroup = true;
			boolean[] valid = new boolean[26];

			for(int i = 0; i < word.length(); i++) {
				int idx = word.charAt(i)-'a';
				if(valid[idx]) {
					if(word.charAt(i) != word.charAt(i-1)) {
						ynGroup = false;
						break;
					}
				} else
					valid[idx] = true;
			}
			if(ynGroup) cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}

	private static void croatiaAlphabet(Scanner sc) {
		String word = sc.next();
		String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		for(int i = 0; i < arr.length; i++) {
			if(word.contains(arr[i]))
				word = word.replace(arr[i], "!");
		}
		System.out.println(word.length());
		sc.close();
	}

	private static void studyingVoca(Scanner sc) {
		String word = sc.next().toUpperCase();
		
		int[] cnt = new int[26];
		for(int i = 0; i < word.length(); i++) {
			int num = word.charAt(i)-'A';
			cnt[num]++;
		}
		
		int max = 0;
		char result = '?';
		for(int j = 0; j < cnt.length; j++) {
			if(max < cnt[j]) {
				max = cnt[j];
				result = (char)(j+'A');
			} else if(max == cnt[j]) {
				result = '?';
			}
		}
		System.out.println(result);
		sc.close();
	}

	private static void palindrome(Scanner sc) {
		String orgWord = sc.next();
		
		StringBuffer sb = new StringBuffer(orgWord);
		String newWord = sb.reverse().toString();
		
		if(orgWord.equals(newWord))
			System.out.println("1");
		else
			System.out.println("0");
		sc.close();
	}

	private static void printStars(Scanner sc) {
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < n-i; j++) 
				System.out.print(" ");
			for(int j = 0; j < i*2-1; j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i = n-1; i >= 1; i--) {
			for(int j = 0; j < n-i; j ++) 
				System.out.print(" ");
			for(int j = 0; j < i*2-1; j++)
				System.out.print("*");
			System.out.println();
		}
		
		sc.close();
	}

	private static void chess(Scanner sc) {
		int arr[] = {1, 1, 2, 2, 2, 8};
		
		for(int i = 0; i < arr.length; i ++) {
			int len = sc.nextInt();
			int sub = arr[i] - len;
			
			if(i == arr.length-1)
				System.out.print(sub);
			else
				System.out.print(sub + " ");
		}
		sc.close();
	}
		
}

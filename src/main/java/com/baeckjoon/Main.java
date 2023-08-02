package com.baeckjoon;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String orgWord = sc.next();
		
		StringBuffer sb = new StringBuffer(orgWord);
		String newWord = sb.reverse().toString();
		
		if(orgWord.equals(newWord))
			System.out.println("1");
		else
			System.out.println("0");
		sc.close();
	}
}
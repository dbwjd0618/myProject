package com.baeckjoon;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		/**
		 * 5622. 다이얼
		 * 2 : ABC
		 * 3 : DEF
		 * 4 : GHI
		 * 5 : JKL
		 * 6 : MNO
		 * 7 : PQRS
		 * 8 : TUV
		 * 9 : WXYZ
		 * 
		 * UNUCIC : 868242 => 36
		 */
		Scanner sc = new Scanner(System.in);
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
}


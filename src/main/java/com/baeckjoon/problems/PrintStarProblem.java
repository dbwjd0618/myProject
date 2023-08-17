package com.baeckjoon.problems;

public class PrintStarProblem {

	public static void main(String[] args) {
//		exam1();
//		exam2();
//		exam3();
//		exam4();
//		exam5();
//		exam6();
//		exam7();
//		exam8();
		exam9();
	}

//      *
//     ***
//    *****
// 	 *******
//	*********
//	 *******
//	  *****
//	   ***
//	    *
	private static void exam9() {
		int n = 5;
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
	}

//	*********
//	 *******
//	  *****
//	   ***
//	    *
	private static void exam8() {
		for(int i = 5; i > 0; i --) {
			for(int j = 0; j < 5-i; j++)
				System.out.print(" ");
			for(int j = 0; j < 2*i-1; j++)
				System.out.print("*");
			System.out.println();
		}
	}

//	    *
//	   ***
//	  *****
//	 *******
//	*********
	private static void exam7() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < 5-i; j++)
				System.out.print(" ");
			for(int j = 0; j < 2*i-1; j++)
				System.out.print("*");
			System.out.println();
		}
	}

//	*****
//	****
//	***
//	**
//	*
//	**
//	***
//	****
//	*****
	private static void exam6() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5-i; j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < i+2; j++)
				System.out.print("*");
			System.out.println();
		}
	}

//	*
//	**
//	***
//	****
//	*****
//	****
//	***
//	**
//	*
	private static void exam5() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4-i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

//	    *
//	   **
//	  ***
//	 ****
//	*****
	private static void exam4() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5-(i+1); j++)
				System.out.print(" ");
			for(int j = 0; j < i+1; j++)
				System.out.print("*");
			System.out.println();
		}
	}

//	*****
//	 ****
//	  ***
//	   **
//	    *
	private static void exam3() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++)
				System.out.print(" ");
			for(int j = 0; j < 5-i; j++)
				System.out.print("*");
			System.out.println("");
		}
	}

//	*****
//	****
//	***
//	**
//	*
	private static void exam2() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5-i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

//	*
//	**
//	***
//	****
//	*****
	private static void exam1() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}

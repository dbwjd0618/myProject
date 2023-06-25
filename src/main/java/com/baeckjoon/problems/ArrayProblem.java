package com.baeckjoon.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 백준 결과 성공여부에 관계없이 결과가 나온 코드를 작성
 */
public class ArrayProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		countUp(sc);		// 10807. 개수 세기
		putBall(sc);		// 10810. 공 넣기
		changeBall(sc); 	// 10813. 공 바꾸기
		missTask(sc);		// 5597. 과제 안내신 분
		backetsReverse(sc); // 10811. 바구니 뒤집기
	}

	private static void backetsReverse(Scanner sc) {
		// 결과 값은 잘 출력되나 백준에 제출할 때 실패한 코드
		String[] terms = sc.nextLine().split(" ");
		int N = Integer.parseInt(terms[0]);
		int M = Integer.parseInt(terms[1]);
		
		int[] backets = new int[N];
		int[] tmp = new int[backets.length];
		
		// 최초 데이터 세팅
		for(int i = 0; i < N; i ++) {
			backets[i] = i+1;
		}
		
		for(int j = 0; j < M; j ++) {
			for(int k = 0; k < backets.length; k ++) {
				tmp[k] = backets[k];
			}
			
			String[] section = sc.nextLine().split(" ");
			int start = Integer.parseInt(section[0])-1;
			int end = Integer.parseInt(section[1])-1;
			
			if(end-start > 1) {
				int gap = end - start;
				for(int m = 0; m <= gap; m ++) {
					backets[m] = tmp[end-start];
					start++;
				}
			} else {
				backets[start] = tmp[end];
				backets[end] = tmp[start];
			}
		}
		
		String ret = "";
		for (int n = 0; n < backets.length; n++) {
			ret += backets[n] + " ";
		}
		System.out.print(ret.trim());
		sc.close();
	}

	private static void missTask(Scanner sc) {
		// submited에 30이 들어가는 경우 때문에 31로 생성
		int[] students = new int[31];
		
		for(int j = 0; j < 28; j ++) {
			int submited = sc.nextInt();
			students[submited] = 1;
		}
		
		for(int i = 1; i < students.length; i ++) {
			if(students[i] != 1) {
				System.out.println(i);
			}
		}
	}

	/**
	 * 처음 바구니에 들어있는 공의 숫자는 바구니의 번호와 같다.
	 * 5 4 : N(바구니의 개수) M:(섞을 횟수)
	 * 1 2 : 2 1 3 4 5
	 * 3 4 : 2 1 4 3 5
	 * 1 4 : 3 1 4 2 5
	 * 2 2 : 3 1 4 2 5
	 */
	private static void changeBall(Scanner sc) {
		String[] terms = sc.nextLine().split(" ");
		int N = Integer.parseInt(terms[0]);
		int M = Integer.parseInt(terms[1]);
		
		int[] baskets = new int[N];
		for(int i = 0; i < baskets.length; i ++) {
			baskets[i] = i+1;
		}
		
		for(int j = 1; j <= M; j ++) {
			String[] arr = sc.nextLine().split(" ");
			int bskStart = Integer.parseInt(arr[0]) - 1;
			int bskEnd = Integer.parseInt(arr[1]) - 1;
			
			int org = baskets[bskStart];
			baskets[bskStart] = baskets[bskEnd];
			baskets[bskEnd] = org;
		}
	    for(int k = 0; k < baskets.length; k++) {
	        System.out.print(baskets[k] + " ");
	    }
	}

	/**
	 * 5 4		: N(바구니의 개수) M(바구니에 공을 넣을 횟수)
	 * 1 2 3	: 1~2번 바구니에 3번 공(3 3 0 0 0) 
	 * 3 4 4	: 3~4번 바구니에 4번 공(3 3 4 4 0)
	 * 1 4 1	: 1~4번 바구니에 1번 공(1 1 1 1 0)
	 * 2 2 2	: 2번 바구니에 2번 공(1 2 1 1 0)
	 */
	private static void putBall(Scanner sc) {
		String[] terms = sc.nextLine().split(" ");
		int N = Integer.parseInt(terms[0]);
		int M = Integer.parseInt(terms[1]);
		
		int[] baskets = new int[N];
		int bskStart = 0;
		int bskEnd = 0;
		int numBall = 0;
		
		for(int i = 0; i < M; i ++) {
			String[] arr = sc.nextLine().split(" ");
			bskStart = Integer.parseInt(arr[0]);
			bskEnd = Integer.parseInt(arr[1]);
			numBall = Integer.parseInt(arr[2]);
			
			for(int j = bskStart-1; j <= bskEnd-1; j ++) {
				baskets[j] = numBall;
			}
		}
        for(int k = 0; k < baskets.length; k++) {
            System.out.print(baskets[k] + " ");
        }
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
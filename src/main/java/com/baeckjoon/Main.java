package com.baeckjoon;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
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
}
package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		int[] intall = new int[2];
		
		
		while(true) {
			
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			choice = sc.nextInt();
				
				
		
			if(choice==1) {
				System.out.print("예금액> ");
				intall[0] = sc.nextInt();
			} else if(choice==2) {
				System.out.print("출금액> ");
				intall[1] = sc.nextInt();
			} else if(choice==3) {
				System.out.print("잔고액> " + (intall[0]-intall[1]));
				System.out.println();
			} else if(choice==4) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("다시 입력해주세요");
			}
	}
		sc.close();
}
}
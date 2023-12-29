package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		//줄여드는 *
		for(int i=1; i<=num; i++) {
			for(int j=num; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//늘어나는 *
		for(int k=2; k<=num; k++) {
			for(int h=1; h<=k; h++) {
			System.out.print("*");
		}
		System.out.println();
		}
		
		sc.close();
	}
}

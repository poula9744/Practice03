package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		int result = 0;
		for(int i=1; i<=num; i++) { //합계구하기
			result += i;
			
			if(i==1) {//계산식이 포함
				System.out.print(i); 
			} else {
				System.out.print("+" + i); 
			}
		}System.out.println();
		
		System.out.println("합계: " + result);
		
		sc.close();
		}
	}



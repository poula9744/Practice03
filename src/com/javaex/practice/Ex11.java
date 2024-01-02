package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int sum01 = 0;
		int sum02 = 0;
		
		for(int i=1; i <= num; i++) {//짝수인 경우, 입력 값까지 짝수의 합
			if(i%2==0) { 
				sum02 = sum02 + i ;
			}
		} 
		
		for(int j=1; j <= num; j++) {//홀수인 경우, 입력 값까지 홀수의 합
			if(j%2!=0){
				sum01 = sum01 + j;
			}
		}
		if(num%2==0) {
			System.out.println("결과값: " + sum02);
		} else { 
			System.out.println("결과값: " + sum01); 
		}
		sc.close();
	}

}

/*	int startNum;
		int sum = 0;

		if (num % 2 == 1) {
			startNum = 1;
		} else {
			startNum = 2;
		}

		for (int i = startNum; i <= num; i = i + 2) {
			sum = sum + i;
		}

		System.out.println("결과값: " + sum);

 */

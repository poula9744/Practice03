package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		int num01 = sc.nextInt();
		
		System.out.print("숫자: ");
		int num02 = sc.nextInt();
		
		System.out.print("숫자: ");
		int num03 = sc.nextInt();
		
		System.out.print("숫자: ");
		int num04 = sc.nextInt();
		
		System.out.print("숫자: ");
		int num05 = sc.nextInt();
		
		int i = 1;
		while(true) {
			if(num01>=num02 && num01>=num03 && num01>=num04 && num01>=num05) {
				System.out.println("최대값은 "+num01+"입니다." );
				break;
			} else if(num02>=num01 && num02>=num03 && num02>=num04 && num02>=num05) {
				System.out.println("최대값은 "+num02+"입니다." );
				break;
			} else if(num03>=num01 && num03>=num02 && num03>=num04 && num03>=num05) {
				System.out.println("최대값은 "+num03+"입니다." );
				break;
			} else if(num04>=num01 && num04>=num02 && num04>=num03 && num04>=num05) {
				System.out.println("최대값은 "+num04+"입니다." );
				break;
			} else if(num05>=num01 && num05>=num02 && num05>=num03 && num05>=num04) {
				System.out.println("최대값은 "+num05+"입니다." );
				break;
			} 
			i++;
		}
		

		sc.close();

	}

}

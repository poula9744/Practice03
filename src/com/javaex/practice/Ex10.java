package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0;

		System.out.println("숫자를 입력하세요");
		for(int i=0; i<5; i++) {
			System.out.print("숫자: ");
			int num = sc.nextInt();
			if (max < num) {
				max = num;
			}
		} 

		System.out.println("최대값은 " + max + " 입니다.");
		
		
		
		
/*		while(true) {
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

		}
		
*/
		sc.close();

	}

}

package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		
		for(int i=1; i<5; i++) {
			System.out.println(i);
		}
		System.out.println("=================");

		for(int i=10; i>0; i=i-2) {
			System.out.println(i);
		}
	}
}
/*
[예상]
1 (1)
2 (1++)
3 (2++)
4 (3++)
===================
10 (10)
8 (10-2)
6 (10-4)
4 (10-6)
2 (10-8)
*/
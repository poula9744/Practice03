package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		
		int x, y;
		for(x=0; x<4; x++) {
			for(y=0; y<2; y++) {
				System.out.println("*");
			}
			System.out.println("");
		} 
	}
}
/*
  [예상]
   * 0
   * 1
   줄 바꿈 0
   * 0	
   * 1
   줄 바꿈 1
   * 0	
   * 1
   줄 바꿈 2 
   * 0
   * 1
   줄 바꿈 4
 */

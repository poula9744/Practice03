package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		
		int i=1;
		boolean flag = true; //break를 사용하지 않고 true값을 false로 만들어서 멈추게 하는 방법
		
		while(flag) {
			if(i>=5) {
				flag = false; //break와 비슷한 역할이지만, 끝까지 돈다.
			}
			System.out.println(i);
			i=i+1;
		}
		/*
			1
			2
			3
			4
			5 <<5까지 출력됨
		*/
		
		
		System.out.println("==================");
		
		int d=1;
		while(true) {
			if(d>=5) {
				break; //4에서 멈춤
			}
			System.out.println(d);
			d=d+1;
		} 
	}	/*
			1
			2
			3
			4 <<4에서 멈춤
	 	*/

}


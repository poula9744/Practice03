package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==========================");
		System.out.println("   [숫자맞추기게임 시작]  ");
		System.out.println("==========================");
		
		//정답
		int random = (int)(Math.random()*100)+1;
		//테스트용: int random = 10;
		
		
		//게임 시작
		while(true) {
			System.out.print(">>");
			int num = sc.nextInt();
			
			if(num>random) {
				System.out.println("더 낮게");
			} else if(num<random) {
				System.out.println("더 높게");
			} else if(num==random) { //정답
				System.out.println("맞았습니다.");
				
			sc.nextLine();
				
				
				//게임 종료
			}	System.out.print("게임을 종료하시겠습니까? (y/n) >>");
				String game = sc.nextLine();
					if(game.equals("y")) {
						System.out.println("==========================");
						System.out.println("   [숫자맞추기게임 종료]  ");
						System.out.println("==========================");
						break;
					
					} else if(game.equals("n")) {
						
				}
				
			}
		sc.close();
		}
		
		
	}
	

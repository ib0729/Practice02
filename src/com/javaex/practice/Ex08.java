package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner so = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		
		System.out.print("숫자1: ");
		int num1 = so.nextInt();
		
		System.out.print("숫자2: ");
		int num2 = so.nextInt();
		
		System.out.print("숫자3: ");
		int num3 = so.nextInt();
		
		if(num1 <= num2 && num1 <= num3) {
			System.out.println("가장 작은수는" + num1 + " 입니다.");
		}else if(num2 <= num1 && num2 <= num3) {
			System.out.println("가장 작은수는" +num2 + " 입니다.");
		}else if(num3 <= num1 && num3<=num2) {
			System.out.println("가장 작은수는" + num3 + " 입니다.");
		}
		
		
		so.close();
	}

}

package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner so = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int age = so.nextInt();                  // 15 19 20 2번그룹
												// 100은 1번그룹
		if(age > 20) {
			System.out.println("\"1번그룹\""); 
		}else {
			System.out.println("\"2번그룹\"");
		}
		System.out.println("입니다.");
	
		
		so.close();
	
	}

}

package com.javaex.practice;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int age = 15;
		
		//age가 0살 초과이고 18살 미만이면
		if(0 < age && age <18) {
			System.out.println("청소년입니다.");
		}
		
		
		sc.close();
		
	}

}

package net.hb.day28;

import java.util.Scanner;

public class KeyboardInput2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("이름, 나이, 몸무게를 공간(space)으로 구분하여 입력");
		String name = stdIn.next();
		int i = stdIn.nextInt();
		double d = stdIn.nextDouble();
		System.out.println(name + "씨의 나이는 " + i + "세이고");
		System.out.println("몸무게는 " + d + "kg 입니다");

	}// main end
}// class end

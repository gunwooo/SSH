package net.hb.day28;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		System.out.println("Two.java");

		int age; // 선언
		age = 1; // 값대입=할당=assignment->초기화

		double mom = 1, ki = 100;

		Scanner stdIn = new Scanner(System.in);
		System.out.print("나이입력? ");
		age = stdIn.nextInt();
		System.out.print("키? ");
		ki = stdIn.nextDouble();
		System.out.print("몸무게? ");
		mom = stdIn.nextDouble();
		System.out.println("");
		System.out.println("---------------------");
		System.out.println("나이= " + age + " 세" + "\n키= " + ki + " cm" + "\n몸무게= " + mom + " kg");
		System.out.println("---------------------");
		System.out.println("\n영수증출력 10:31");
		stdIn.close();
	}// main end
}// class end

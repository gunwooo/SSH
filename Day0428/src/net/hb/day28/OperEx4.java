package net.hb.day28;

public class OperEx4 {
	public static void main(String[] args) {// Page 74, 80
		System.out.println("OperEx4.java ");
		int a = 10, b = 20;

		boolean c = (a > 7) && (b > 50);
		System.out.println(c);
		String id = "sky", password = "1234";
		if (id == "sky" && password == "1234") {
		} else {
			System.out.println("�α����� �ٽ� �ϼ��� ");
		}

		// ���迬����
		System.out.println("");
		boolean dap1 = a > b;
		boolean dap2 = a != b;
		boolean dap3 = a == b;
		System.out.println(a + " < " + b + " ����� " + dap1);
		System.out.println(a + " != " + b + " ����� " + dap2);
		System.out.println(a + " == " + b + " ����� " + dap3);
	}// main end
}// class end

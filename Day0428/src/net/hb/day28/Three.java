package net.hb.day28;

public class Three {
	public static void main(String[] args) {
		System.out.println("Three.java");

		// ���� ���� ����==>���׽�
		// ���׽�=>1�� ����, 1�� ����
		int a = 4, b = 4, c = 0;
		int sum1 = 0, sum2 = 0;

		// sum1 = --a + 3;//++������ a�� ������ 1�� ����
		// sum2 = b-- + 3;//++������ b�� ������ 1�� ����
		// System.out.println("a=" + a + "\tsum1=" + sum1);
		// System.out.println("b=" + b + "\tsum2=" + sum2);

		++a;//�ܵ��ϋ��� ++�� ��ġ�� ���� ����� ���� 
		b++;
		System.out.println("a=" + b);
		System.out.println("b=" + b);

	}// main end
}// class end

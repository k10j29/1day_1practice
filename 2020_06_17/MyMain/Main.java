package MyMain;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {

			for (int j = num - i; j <= num; j++) {

				System.out.print("*");

			}
			System.out.println();
		}

		scan.close();
	}
}

/*
 * ���� ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
 * 
 * �Է� ù° �ٿ� N(1 �� N �� 100)�� �־�����.
 * 
 * ��� ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
 */

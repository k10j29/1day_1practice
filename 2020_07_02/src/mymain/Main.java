package mymain;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}

		System.out.println(sum);

	}
}


//���� 8393

//����
//n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� n (1 �� n �� 10,000)�� �־�����.
//
//���
//1���� n���� ���� ����Ѵ�.
//

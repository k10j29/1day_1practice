package MyMain;

import java.util.Scanner;

public class mymain_for {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			// &&&&& �ε�ȣ ���� ����
			System.out.println(n + " * " + i + " = " + (n * i));

		}

		sc.close();

	}

}

//����
//N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
//
//�Է�
//ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 9���� �۰ų� ����.
//
//���
//������İ� ���� N*1���� N*9���� ����Ѵ�.
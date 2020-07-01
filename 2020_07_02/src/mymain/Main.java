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


//백준 8393

//문제
//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
//
//출력
//1부터 n까지 합을 출력한다.
//

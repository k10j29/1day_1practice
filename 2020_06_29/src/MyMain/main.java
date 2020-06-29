package MyMain;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			for (int k = i + 1; k < num; k++) {

				System.out.print(" ");

			}

			for (int h = num - i; h <= num; h++) {

				System.out.print("*");
			}

			System.out.println();
		}
	}

}

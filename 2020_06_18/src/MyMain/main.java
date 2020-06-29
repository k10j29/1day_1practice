package MyMain;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if (a > 100000) {
			System.exit(0);
		}
		for (int i = 1; i <= a; i++) {
			System.out.println(i);
		}
	}// end of main
}
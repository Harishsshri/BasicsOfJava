package sbi.application.createAccount;

public class FibonicciSeries {

	public static void main(String[] args) {
		int f1 = 0;
		int f2 = 1;
		System.out.print(f1 + " " + f2);
		for (int i = 2; i <= 10; i++) {
			int temp;
			temp = f1 + f2;
			System.out.print(" " + temp);
			f1 = f2; // 1
			f2 = temp; // 1
		}

	}

}
//0 1 1 2 3 5 8 13 21 34 55 89
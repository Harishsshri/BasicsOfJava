package sbi.application.createAccount;

import java.util.Scanner;

public class AmstrongNumber {
	static Scanner sc = new Scanner(System.in);
	static int digit = 0;

	public static void countinginputlength(long input) {
		while (input > 0) {
			input = input / 10;
			digit++;
		}
	}

	private static long FindingAmstrongNumber(long input) {
		long result = 0;
		countinginputlength(input);
		while (input > 0) {
			long n1 = input % 10;
			input = input / 10;
			// long result=0;
			result += Math.pow(n1, digit);
			// System.out.println(digit);
		}
		return result;
	}

	public static void main(String[] args) {
		// Calculation
		// 153
		System.out.println("Enter a number to check Amstrong number or not");
		long input = sc.nextLong();
		long finalValue = FindingAmstrongNumber(input);
		// System.out.println(finalValue);
		if (input == finalValue) {
			System.out.println(input + " is amstrong number");
		} else {
			System.out.println(input + "is not a amstrong number");
		}
	}

}

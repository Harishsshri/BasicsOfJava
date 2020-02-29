package sbi.application.createAccount;

public class Methods {

	static void returnNothing() {
      System.out.println("Example method for return type void");
	}

	static boolean testMethod(Boolean a) {
		boolean c = a;
		return c;
	}

	static double areaOfRectangle(float l, float b) {
		double areaR = l * b;
		return areaR;
	}

	static double PerimeterOfRectangle(float l, float w) {
		double perimeterR = 2 * (l + w);
		return perimeterR;
	}

	public static void main(String[] args) {
		boolean ans = testMethod(false);
		System.out.println(ans);

	}

}

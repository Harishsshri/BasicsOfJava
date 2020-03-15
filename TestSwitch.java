package sbi.application.createAccount;

import java.util.Scanner;

public class TestSwitch {
	static Scanner scan = new Scanner(System.in);
	static float length;
	static float breadth;
	static float width;
	static float height;
	static float sideA;
	static float sideB;
	static float sideC;
	static double area;
	static double perimeter;

	public static void main(String[] args) {

		System.out.println("Please select any one of the options from the below list");
		System.out.println("1.Area of Rectangle\n2.Area of Triangle\n3.Perimeter of rectagle\n4.Perimeter of Triangle");
		int selectedChoice = scan.nextInt();
		switch (selectedChoice) {
		case 1: {
			System.out.println("Enter length:");
			length=scan.nextFloat();
			System.out.println("Enter breadth");
			breadth=scan.nextFloat();
			area = Methods.areaOfRectangle(length, breadth);
			System.out.println("Area of Rectangle is:" +  area);
		}
			break;
		case 2: {
			System.out.println("Enter the height");
			height=scan.nextFloat();
			System.out.println("Enter the breadth");
			breadth=scan.nextFloat();
			area = Methods.AreaOfTraingle(height, breadth);
			System.out.println("Area of Triangle is:" +  area);
		}
			break;
		case 3: {
			System.out.println("Enter the lenghth");
			length=scan.nextFloat();
			System.out.println("Enter the width");
			width=scan.nextFloat();
			area = Methods.PerimeterOfRectangle(length, width);
			System.out.println("Perimeter of Rectangle:" +  area);
		}
			break;
		case 4: {
			System.out.println("Enter the size of side A");
			sideA=scan.nextFloat();
			System.out.println("Enter the size of side B");
			sideB=scan.nextFloat();
			System.out.println("Enter the size of side C");
			sideC=scan.nextFloat();
			area = Methods.PerimterOfTraingle(sideA, sideB, sideC);
			System.out.println("Perimeter of Triangle:" +  area);
		}
		break;
		default:
			System.out.println("Please enter the valid number");
		}
}
}
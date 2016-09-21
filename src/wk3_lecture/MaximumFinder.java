package wk3_lecture;

import java.util.Scanner;

// Find the maximum value among 3 double values
public class MaximumFinder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Prompt user for input
		System.out.print("Enter 3 floating-point values separated by spaces: ");

		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();

		double result = maximum(number1, number2, number3);

		System.out.println("The maximum of the 3 floating-point numbers is: " + result);
	}

	public static double maximum(double x, double y, double z) {

		// METHOD 1
		// if (x > y) {
		// if (x > z)
		// return x;
		// else
		// return z;
		// } else {
		// if (y > z)
		// return y;
		// else
		// return z;
		// }

		// METHOD 2
		// double maxValue = x;
		// if(y>maxValue) maxValue=y;
		// if(z>maxValue) maxValue=z;
		// return maxValue;

		// METHOD 3
		return Math.max(Math.max(x, y), z);
	}
}

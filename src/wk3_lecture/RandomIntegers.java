package wk3_lecture;

import java.security.SecureRandom;

public class RandomIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SecureRandom randomNumbers = new SecureRandom();

		for (int counter = 1; counter <= 20; counter++) {
			int face = 1 + randomNumbers.nextInt(6);

			System.out.printf("%d ", face);
		}

	}

}
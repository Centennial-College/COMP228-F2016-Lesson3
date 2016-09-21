package wk3_lecture;

import java.security.SecureRandom;

public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SecureRandom randomNumbers = new SecureRandom();

		int[] frequencies = new int[7];

		// int frequency1 = 0;
		// int frequency1 = 0;
		// int frequency1 = 0;
		// int frequency1 = 0;
		// int frequency1 = 0;
		// int frequency1 = 0;

		for (int i = 0; i < 6000000; i++) {
			int face = 1 + randomNumbers.nextInt(6);
			frequencies[face]++;
			// switch (face) {
			// case 1:
			// ++frequency1;
			// break;
			// case 2:
			// break;
			// case 3:
			// break;
			// case 4:
			// break;
			// case 5:
			// break;
			// case 6:
			// break;
			// }
		}

		System.out.println("Face\tFrequency");
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frequencies[1], frequencies[2], frequencies[3],
				frequencies[4], frequencies[5], frequencies[6]);
	}

}

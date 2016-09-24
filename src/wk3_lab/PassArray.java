package wk3_lab;

public class PassArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		System.out.printf(
				"Effects of passing reference to entire array: %n" + "The values of the original array are: %n");

		// for loop
		// for (int i = 0; i < array.length; i++) {
		// System.out.printf(" %d", array[i]++);
		// // array[i]++;
		// // System.out.printf(" %d%n", array[i]);
		// }
		//

		// foreach loop - a.k.a enhanced for loop
		for (int value : array) {
			System.out.printf(" %d", value);
		}

		modifyArray(array);

		System.out.println();

		System.out.println("The values of the modified array are:");
		for (int value : array) {
			System.out.printf(" %d", value);
		}
		
		System.out.printf("%n%nEffects of passing array element value: %narray[3] before modify Element: %d%n", array[3]);
		
		modifyElement(array[3]);
		
		System.out.printf("array[3] after modification of element: %d%n", array[3]);
	}

	/**
	 * This subroutine multiplies every value within the array by 2
	 * 
	 * @param array2
	 * @return {void}
	 */
	public static void modifyArray(int array2[]) {
		for (int counter = 0; counter < array2.length; counter++) {
			array2[counter] *= 2;
		}
	}

	/**
	 * This subroutine multiplies the argument by 2 and displays it to the
	 * screen.
	 * 
	 * @param element
	 * @return {void}
	 */
	public static void modifyElement(int element) {
		element *= 2;
		System.out.printf("%nValue of element in modifyElement: %d%n%n", element);
	}
}

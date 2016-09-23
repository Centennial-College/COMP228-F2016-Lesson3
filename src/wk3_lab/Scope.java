package wk3_lab;

public class Scope {

	public static int x = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;

		System.out.printf("%nlocal x in main is %d%n", x);

		useLocalVariable();

		useField();
		
		useLocalVariable();

		useField();

		System.out.printf("%nlocal x in main is %d%n", x);
		
	}

	public static void useLocalVariable() {
		int x = 25; // initialized each time useLocalVariable is called

		System.out.printf("%nlocal x on entering method useLocalVariable is %d%n", x);

		// Increment x by 1
		++x;

		System.out.printf("%nlocal x before leaving method useLocalVariable is %d%n", x);
	}

	public static void useField() {
		System.out.printf("%nfield x on entering method useField is %d%n", x);

		// Multiply x by 10
		x *= 10;

		System.out.printf("%nfield x before leaving method useField is %d%n", x);
	}

}

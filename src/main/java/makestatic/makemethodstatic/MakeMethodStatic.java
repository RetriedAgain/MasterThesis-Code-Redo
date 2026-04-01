package makestatic.makemethodstatic;

public class MakeMethodStatic {
	public int i;
	public int j;

	public void methodDialog1() {
		System.out.println("To Be Static or not to be.");
	}

	public static void methodDialog2(int secret1, int secret2, String string) {
		System.out.println("To Be Static or not to be + " + secret1 + secret2 + string);
	}

	public void useMethodsInside() {
		methodDialog1();
		methodDialog2(i, j, "Hi");
	}
}

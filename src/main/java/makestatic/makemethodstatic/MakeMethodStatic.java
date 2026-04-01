package makestatic.makemethodstatic;

public class MakeMethodStatic {
	public int i;
	public int j;

	public void methodDialog1() {
		System.out.println("To Be Static or not to be.");
	}

	public void methodDialog2(String string) {
		methodDialog2(this, j, i, string);
	}

	public static void methodDialog2(MakeMethodStatic secret1, int secret3, int secret2, String string) {
		System.out.println("To Be Static or not to be + " + secret2 + secret3 + string);
	}

	public void useMethodsInside() {
		methodDialog1();
		methodDialog2("Hi");
	}
}

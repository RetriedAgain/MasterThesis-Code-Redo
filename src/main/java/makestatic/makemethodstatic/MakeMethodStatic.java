package makestatic.makemethodstatic;

public class MakeMethodStatic {
	public int i;
	public int j;

	public void methodDialog1() {
		System.out.println("To Be Static or not to be.");
	}

	public static void methodDialog2(int i, int j, String string) {
		System.out.println("To Be Static or not to be + " + i + j + string);
	}

	public void useMethodsInside() {
		methodDialog1();
		methodDialog2(i, j, "Hi");
	}
}

package makestatic.makemethodstatic;

public class MakeMethodStatic {
	public int i;
	public int j;

	public void methodDialog1() {
		System.out.println("To Be Static or not to be.");
	}

	public void methodDialog2(String string) {
		methodDialog2(this, string);
	}

	public static void methodDialog2(MakeMethodStatic makeMethodStatic, String string) {
		System.out.println("To Be Static or not to be + " + makeMethodStatic.i + makeMethodStatic.j + string);
	}

	public void useMethodsInside() {
		methodDialog1();
		methodDialog2("Hi");
	}
}

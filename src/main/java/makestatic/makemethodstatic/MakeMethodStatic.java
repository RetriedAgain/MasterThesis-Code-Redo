package makestatic.makemethodstatic;

class MakeMethodStatic {
	private int i;
	private int j;

	public void methodDialog1() {
		System.out.println("To Be Static or not to be.");
	}

	public void methodDialog2(String string) {
		System.out.println("To Be Static or not to be + " + i + j + string);
	}

	public void useMethodsInside() {
		methodDialog1();
		methodDialog2("Hi");
	}
}

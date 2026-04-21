package makestatic.makemethodstatic;

class UseMakeMethodStatic {

	private MakeMethodStatic makeMethodStatic = new MakeMethodStatic();

	public void useMethodsOutside() {
		makeMethodStatic.methodDialog1();
		makeMethodStatic.methodDialog2("Hi");
	}
}

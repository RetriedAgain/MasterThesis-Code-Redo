package makestatic.makemethodstatic;

public class UseMakeMethodStatic {

	MakeMethodStatic makeMethodStatic = new MakeMethodStatic();

	public void useMethodsOutside() {
		MakeMethodStatic.methodDialog1();
		makeMethodStatic.methodDialog2("Hi");
	}
}

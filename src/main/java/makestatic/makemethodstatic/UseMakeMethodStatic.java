package makestatic.makemethodstatic;

public class UseMakeMethodStatic {

	MakeMethodStatic makeMethodStatic = new MakeMethodStatic();

	public void useMethodsOutside() {
		makeMethodStatic.methodDialog1();
		makeMethodStatic.methodDialog2("Hi");
	}
}

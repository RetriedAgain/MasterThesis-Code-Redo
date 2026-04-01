package makestatic.makemethodstatic;

public class UseMakeMethodStatic {

	MakeMethodStatic makeMethodStatic = new MakeMethodStatic();

	public void useMethodsOutside() {
		makeMethodStatic.methodDialog1();
		MakeMethodStatic.methodDialog2(makeMethodStatic.j, makeMethodStatic.i, "Hi");
	}
}

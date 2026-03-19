package inlines.inlinemethod;

public class InlineMethod {

	public static void usage1() {
		System.out.println("Usage1");
		System.out.println("This should be inlined.");
	}

	public static void usage2() {
		System.out.println("This should be inlined.");
	}

	public static void usage3() {
		usage1();
		usage2();
	}


}

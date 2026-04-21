package inlines.inlinemethod;

class InlineMethod {

	public static void toInline() {
		System.out.println("This should be inlined.");
	}

	private static void usage1() {
		System.out.println("Usage1");
		toInline();
	}

	private static void usage2() {
		toInline();
	}

	public static void usage3() {
		usage1();
		usage2();
	}


}

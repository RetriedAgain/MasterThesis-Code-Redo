package inlines.inlineparameter;

public class InlineParameter {

	final static String CONSTANT = "CONSTANT_TO_INLINE";

	static void inlineHere() {
		System.out.println(CONSTANT);
	}

	static void usageHere() {
		inlineHere();
	}

	static void usageHere2() {
		inlineHere();
	}

}

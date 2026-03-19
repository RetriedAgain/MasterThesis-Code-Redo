package inlines.inlineparameter;

public class InlineParameter {

	final static String CONSTANT = "CONSTANT_TO_INLINE";

	static void inlineHere(String inlineThis) {
		System.out.println(inlineThis);
	}

	static void usageHere() {
		inlineHere(CONSTANT);
	}

	static void usageHere2() {
		inlineHere(CONSTANT);
	}

}

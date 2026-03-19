package inlines.inlineparameter;

public class InlineParameter {

	// Uncomment this for special case
	// final static String CONSTANT = "CONSTANT_TO_INLINE";

	void inlineHere() {
		System.out.println("CONSTANT");
	}

	void usageHere() {
		// inlineHere(CONSTANT);
		inlineHere();
	}

	void usageHere2() {
		// inlineHere(CONSTANT);
		inlineHere();
	}

}

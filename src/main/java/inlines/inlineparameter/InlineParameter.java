package inlines.inlineparameter;

class InlineParameter {

	// Uncomment this for special case
	// final static String CONSTANT = "CONSTANT_TO_INLINE";

	void inlineHere(String inlineThis) {
		System.out.println(inlineThis);
	}

	void usageHere() {
		// inlineHere(CONSTANT);
		inlineHere("CONSTANT");
	}

	void usageHere2() {
		// inlineHere(CONSTANT);
		inlineHere("CONSTANT");
	}

}

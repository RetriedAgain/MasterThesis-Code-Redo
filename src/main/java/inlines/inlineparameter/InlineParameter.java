package inlines.inlineparameter;

public class InlineParameter {

	// Uncomment this for special case
	// final static String CONSTANT = "CONSTANT_TO_INLINE";

	void inlineHere() {
		String[] inlineThis = new String[]{"CONSTANT"};
		System.out.println(inlineThis);
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

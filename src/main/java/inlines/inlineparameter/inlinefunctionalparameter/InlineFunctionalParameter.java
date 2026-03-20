package inlines.inlineparameter.inlinefunctionalparameter;

import java.security.PrivilegedAction;

public class InlineFunctionalParameter {

	// Uncomment this for special case
	// final static PrivilegedAction<String> CONSTANT_TO_INLINE = () -> "CONSTANT";

	void inlineHere() {
		System.out.println((PrivilegedAction<String>) () -> "CONSTANT");
	}

	void usageHere() {
		// inlineHere(CONSTANT_TO_INLINE);
		inlineHere();
	}

	void usageHere2() {
		// inlineHere(CONSTANT_TO_INLINE);
		inlineHere();
	}

}

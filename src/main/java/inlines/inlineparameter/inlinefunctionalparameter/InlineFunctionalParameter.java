package inlines.inlineparameter.inlinefunctionalparameter;

import java.security.PrivilegedAction;

public class InlineFunctionalParameter {

	// Uncomment this for special case
	// final static PrivilegedAction<String> CONSTANT_TO_INLINE = () -> "CONSTANT";

	static void inlineHere() {
		System.out.println((PrivilegedAction<String>) () -> "CONSTANT");
	}

	static void usageHere() {
		// inlineHere(CONSTANT_TO_INLINE);
		inlineHere();
	}

	static void usageHere2() {
		// inlineHere(CONSTANT_TO_INLINE);
		inlineHere();
	}

}

package inlines.inlineparameter.inlinefunctionalparameter;

import java.security.PrivilegedAction;

public class InlineFunctionalParameter {

	// Uncomment this for special case
	// final static PrivilegedAction<String> CONSTANT_TO_INLINE = () -> "CONSTANT";

	static void inlineHere(PrivilegedAction<String> action) {
		System.out.println(action);
	}

	static void usageHere() {
		// inlineHere(CONSTANT_TO_INLINE);
		inlineHere(() -> "CONSTANT");
	}

	static void usageHere2() {
		// inlineHere(CONSTANT_TO_INLINE);
		inlineHere(() -> "CONSTANT");
	}

}

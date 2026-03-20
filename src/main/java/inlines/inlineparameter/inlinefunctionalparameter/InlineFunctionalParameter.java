package inlines.inlineparameter.inlinefunctionalparameter;

import java.security.PrivilegedAction;

public class InlineFunctionalParameter {

	// Uncomment this for special case
	final static PrivilegedAction<String> CONSTANT_TO_INLINE = () -> "CONSTANT";

	void inlineHere(PrivilegedAction<String> action) {
		System.out.println(action);
	}

	void usageHere() {
		inlineHere(CONSTANT_TO_INLINE);
	}

	void usageHere2() {
		inlineHere(CONSTANT_TO_INLINE);
	}

}

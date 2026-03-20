package inlines.inlineparameter.inlinefunctionalparameter;

import java.security.PrivilegedAction;

public class InlineFunctionalParameter {

	// Uncomment this for special case
	final static PrivilegedAction<String> CONSTANT_TO_INLINE = () -> "CONSTANT";

	void inlineHere() {
		System.out.println(CONSTANT_TO_INLINE);
	}

	void usageHere() {
		inlineHere();
	}

	void usageHere2() {
		inlineHere();
	}

}

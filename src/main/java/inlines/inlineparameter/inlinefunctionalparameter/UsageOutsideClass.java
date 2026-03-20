package inlines.inlineparameter.inlinefunctionalparameter;

import inlines.inlineparameter.InlineParameter;

public class UsageOutsideClass {

	void usageHere3() {
		InlineFunctionalParameter iFP = new InlineFunctionalParameter();

		// inlineHere(CONSTANT_TO_INLINE);
		iFP.inlineHere(() -> "CONSTANT");
	}
}

package inlines.inlineparameter.inlinefunctionalparameter;

import inlines.inlineparameter.InlineParameter;

public class UsageOutsideClass {

	static void usageHere3() {
		InlineFunctionalParameter.inlineHere(() -> "CONSTANT");
	}
}

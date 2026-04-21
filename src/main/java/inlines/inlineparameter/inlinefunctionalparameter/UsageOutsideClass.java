package inlines.inlineparameter.inlinefunctionalparameter;

class UsageOutsideClass {

	void usageHere3() {
		InlineFunctionalParameter iFP = new InlineFunctionalParameter();

		// inlineHere(CONSTANT_TO_INLINE);
		iFP.inlineHere(() -> "CONSTANT");
	}
}

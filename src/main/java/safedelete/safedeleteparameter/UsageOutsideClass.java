package safedelete.safedeleteparameter;

public class UsageOutsideClass {

	void usageHere3() {
		InlineParameter iP = new InlineParameter();

		// inlineHere(CONSTANT);
		iP.inlineHere("CONSTANT");
	}
}

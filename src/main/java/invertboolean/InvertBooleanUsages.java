package invertboolean;

class InvertBooleanUsages {
	private InvertBoolean inv = new InvertBoolean();
	boolean usageFieldOutside = inv.boolean_field;
//	boolean usageStaticFieldOutside = invertboolean.InvertBoolean.boolean_field;
	boolean usageMethodNonStaticOutside = inv.methodToInvert1();
	boolean usageMethodStaticOutside = InvertBoolean.methodToInvert2();
}

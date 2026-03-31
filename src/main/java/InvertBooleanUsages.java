public class InvertBooleanUsages {
	InvertBoolean inv = new InvertBoolean();
	boolean usageFieldOutside = inv.boolean_field;
//	boolean usageStaticFieldOutside = InvertBoolean.boolean_field;
	boolean usageMethodNonStaticOutside = !inv.secret();
	boolean usageMethodStaticOutside = InvertBoolean.methodToInvert2();
}

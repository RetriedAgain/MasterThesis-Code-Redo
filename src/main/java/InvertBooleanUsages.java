public class InvertBooleanUsages {
	InvertBoolean inv = new InvertBoolean();
//	boolean usageFieldOutside = inv.boolean_field;
	boolean usageStaticFieldOutside = !InvertBoolean.secret;
	boolean usageMethodNonStaticOutside = inv.methodToInvert1();
	boolean usageMethodStaticOutside = InvertBoolean.methodToInvert2();
}

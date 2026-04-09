package pushmembersdown;

public class SubclassToPushMembersInto extends ClassToPushMembersDownFrom.InnerClassToPushMembersDownFrom {
	public static final int SUBCLASS_CONSTANT = 99;

	public SubclassToPushMembersInto(ClassToPushMembersDownFrom outerClassBindingToAvoidCompilerError) {
		outerClassBindingToAvoidCompilerError.super();
	}

	public void subclassMethod() {
		System.out.println("SubclassToPushMembersInto.subclassMethod()");
	}

}

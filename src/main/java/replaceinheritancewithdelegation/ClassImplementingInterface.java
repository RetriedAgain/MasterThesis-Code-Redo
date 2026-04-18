package replaceinheritancewithdelegation;

public class ClassImplementingInterface implements InterfaceToImplement {

	int classImplIntField = 55;

	@Override
	public void run() {
		System.out.println("Hey there Interface from within ClassImplementingInterface");
	}

	@Override
	public void run2() {
		System.out.println("ClassImplInterface Impl of run2");
	}
}

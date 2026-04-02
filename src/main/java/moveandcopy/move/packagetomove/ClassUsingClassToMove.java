package moveandcopy.move.packagetomove;

public class ClassUsingClassToMove {

	ClassToMove classToMove;

	public ClassUsingClassToMove(ClassToMove classToMove) {
		this.classToMove = classToMove;
	}

	public void useInstanceMethod() {
		classToMove.instanceMethodToMove(new TypeExclusiveToProject(), new TypeExclusiveToProject2());
	}

	public void useInstanceMethod2() {
		classToMove.instanceMethodToMove(new TypeExclusiveToProject(), new TypeExclusiveToProject2());
	}

	public static void useStaticMethod() {
		ClassToMove.staticMethodToMove();
	}
}

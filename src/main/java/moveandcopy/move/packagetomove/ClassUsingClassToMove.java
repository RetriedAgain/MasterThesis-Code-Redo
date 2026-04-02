package moveandcopy.move.packagetomove;

public class ClassUsingClassToMove {

	ClassToMove classToMove;

	public ClassUsingClassToMove(ClassToMove classToMove) {
		this.classToMove = classToMove;
	}

	public void useInstanceMethod() {
		new TypeExclusiveToProject().instanceMethodToMove(new TypeExclusiveToProject2(), classToMove);
	}

	public void useInstanceMethod2() {
		new TypeExclusiveToProject().instanceMethodToMove(new TypeExclusiveToProject2(), classToMove);
	}

	public static void useStaticMethod() {
		ClassToMove.staticMethodToMove();
	}
}

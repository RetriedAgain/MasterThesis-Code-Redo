package moveandcopy.move.packagetomove;

public class ClassUsingClassToMove {

	ClassToMove classToMove;
	ClassToMove.InnerClassToMove innerClassToMove;
	ClassToMove.Secret innerInnerClassToMove;

	public ClassUsingClassToMove(ClassToMove classToMove, ClassToMove.InnerClassToMove innerClassToMove,
								 ClassToMove.Secret innerInnerClassToMove) {
		this.classToMove = classToMove;
		this.innerClassToMove = innerClassToMove;
		this.innerInnerClassToMove = innerInnerClassToMove;
	}

	public void useFieldsOfInnerClassToMove(ClassToMove.InnerClassToMove innerClassToMove) {
		System.out.println(innerClassToMove.innerFieldToMove);
		System.out.println(ClassToMove.InnerClassToMove.INNER_CONSTANT_TO_MOVE);
	}

	public void useMethodsOfInnerClassToMove() {
		innerClassToMove.innerMethodToMove();
		ClassToMove.InnerClassToMove.innerStaticMethodToMove();
	}

	public void useMethodsOfInnerInnerClassToMove() {
		innerInnerClassToMove.innerInnerMethodToMove();
		ClassToMove.Secret.innerInnerStaticMethodToMove();
	}

	public void useFieldsOfInnerInnerClassToMove(ClassToMove.Secret innerInnerClassToMove) {
		System.out.println(innerInnerClassToMove.innerInnerFieldToMove);
		System.out.println(ClassToMove.Secret.INNER_INNER_CONSTANT_TO_MOVE);
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

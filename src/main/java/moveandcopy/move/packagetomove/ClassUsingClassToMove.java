package moveandcopy.move.packagetomove;

public class ClassUsingClassToMove {

	ClassToMove classToMove;
	ClassToMove.InnerClassToMove innerClassToMove;
	ClassToMove.InnerClassToMove.InnerInnerClassToMove innerInnerClassToMove;

	public ClassUsingClassToMove(ClassToMove classToMove, ClassToMove.InnerClassToMove innerClassToMove,
								 ClassToMove.InnerClassToMove.InnerInnerClassToMove innerInnerClassToMove) {
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
		ClassToMove.InnerClassToMove.InnerInnerClassToMove.innerInnerStaticMethodToMove();
	}

	public void useFieldsOfInnerInnerClassToMove(ClassToMove.InnerClassToMove.InnerInnerClassToMove innerInnerClassToMove) {
		System.out.println(innerInnerClassToMove.innerInnerFieldToMove);
		System.out.println(ClassToMove.InnerClassToMove.InnerInnerClassToMove.INNER_INNER_CONSTANT_TO_MOVE);
	}

	public void useinnerInnerMethodUsingInstanceOfUpperInnerClass() {
		innerInnerClassToMove.innerInnerMethodUsingInstanceOfUpperInnerClass(innerClassToMove);
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

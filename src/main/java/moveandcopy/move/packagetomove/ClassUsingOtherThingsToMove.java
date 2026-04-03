package moveandcopy.move.packagetomove;

import moveandcopy.move.packagenexttoother.AnnotationToMove;

public class ClassUsingOtherThingsToMove {

	ClassToMove classToMove;
	ClassToMove.InnerClassToMove innerClassToMove;
	ClassToMove.InnerClassToMove.InnerInnerClassToMove innerInnerClassToMove;

	public ClassUsingOtherThingsToMove(ClassToMove classToMove, ClassToMove.InnerClassToMove innerClassToMove,
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



	public void useInstanceMethod() {
		classToMove.instanceMethodToMove(new TypeExclusiveToProject(), new TypeExclusiveToProject2());
	}

	public void useInstanceMethod2() {
		classToMove.instanceMethodToMove(new TypeExclusiveToProject(), new TypeExclusiveToProject2());
	}

	public static void useStaticMethod() {
		ClassToMove.staticMethodToMove();
	}

	// --- Simple examples showing usage of the annotation, enum and record ---

	// 1) Annotated method example
	@AnnotationToMove("example")
	public void annotatedExample() {
		System.out.println("Annotated method executed");
	}

	// 2) Return an enum constant
	public EnumToMove enumExample() {
		return EnumToMove.HELLO;
	}

	// 3) Create and use the record example
	public String recordExample() {
		RecordToMove r = RecordToMove.example();
		return r.info();
	}
}

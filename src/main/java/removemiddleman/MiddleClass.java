package removemiddleman;

class MiddleClass extends UpperClass {
	public int middleField = 1;
	public final static int MIDDLE_CONSTANT = 0;

	public void useUpperClass() {
		System.out.println(upperField);
	}
}

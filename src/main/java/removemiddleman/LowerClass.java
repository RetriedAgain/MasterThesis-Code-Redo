package removemiddleman;

class LowerClass extends MiddleClass {
	public int lowerField = 1;
	public final static int LOWER_CONSTANT = 0;

	public void useMiddleClass() {
		System.out.println(middleField);
	}

}

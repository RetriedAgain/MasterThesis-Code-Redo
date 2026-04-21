package replaceinheritancewithdelegation;

class UpperClass {
	public int upperField = 1;
	public final static int UPPER_CONSTANT = 0;

	public void useUpperAttributes() {
		System.out.println(upperField);
		System.out.println(UPPER_CONSTANT);
	}

	public void additionalMethod(int x) {
		System.out.println(x);
		useUpperAttributes();
	}

}

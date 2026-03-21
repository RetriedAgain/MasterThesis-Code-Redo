/**
 * Example from IntelliJ that seems to work, nothing else really, though and unclear what else can be inlined.
 * https://www.jetbrains.com/help/idea/inline.html#examples
 */
public interface AnInterface {
	int readValue();
}

class AClass implements AnInterface {
	public int readValue() {
		return 1;
	}
}

class UserClass{
	void doSmth(){
		AnInterface a = new AClass();
		// Put cursor on readValue to inline the abstract method
		int i = a.readValue();
	}
}

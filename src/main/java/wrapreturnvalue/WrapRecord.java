package wrapreturnvalue;

public record WrapRecord() {

	static int wrapper;

	WrapRecord(int wrapper) {
		this();
		this.wrapper = wrapper;
	}

	int getWrapper() {
		return wrapper;
	}
}

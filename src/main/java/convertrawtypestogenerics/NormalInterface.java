package convertrawtypestogenerics;

interface NormalInterface<NI> extends SuperInterface<Integer> {
	int INTERFACE_CONSTANT = 1;
	void interfaceRun();
	default void defaultMethodUseSuperInterface() {
		SuperInterface superInterface = this;
		superInterface.superInterfaceRun();
	}
}

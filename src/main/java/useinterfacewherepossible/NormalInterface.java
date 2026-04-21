package useinterfacewherepossible;

interface NormalInterface extends SuperInterface {
	int INTERFACE_CONSTANT = 1;
	void interfaceRun();
	default void defaultMethodUseSuperInterface() {
		SuperInterface superInterface = this;
		superInterface.superInterfaceRun();
	}
}

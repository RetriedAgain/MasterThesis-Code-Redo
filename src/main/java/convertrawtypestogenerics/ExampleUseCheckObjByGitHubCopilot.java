package convertrawtypestogenerics;

import java.util.ArrayList;
import java.util.List;

public class ExampleUseCheckObjByGitHubCopilot {
	void demo() {
		// Raw type that the refactor may convert to Object-parameterized form
		CheckObjByGitHubCopilot raw = new CheckObjByGitHubCopilot();
		// After refactor **checkbox unchecked** -> NormalClass<Object> raw = new NormalClass<Object>();
		// After refactor **checkbox checked**   -> NormalClass raw = new NormalClass();

		// Raw collection similarly:
		List list = new ArrayList();
		list.add(new CheckObjByGitHubCopilot());
		// After refactor **checkbox unchecked** -> List<Object> list = new ArrayList<Object>();
		// After refactor **checkbox checked**   -> List list = new ArrayList();

		// Existing explicit Object-parameterized type is not made raw by this option:
		CheckObjByGitHubCopilot<Object> explicitObject = new CheckObjByGitHubCopilot<Object>();
		// Refactor will not convert this back to raw regardless of the checkbox.
	}
}

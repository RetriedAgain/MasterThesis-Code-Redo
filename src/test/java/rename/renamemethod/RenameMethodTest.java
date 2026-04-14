package rename.renamemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RenameMethodTest {

	@Test
	void secretTest() {
		assertEquals(0, new RenameMethod().secret());
	}
}

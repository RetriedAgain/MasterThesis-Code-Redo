package rename.renamemethod;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class RenameMethodTest {

	@Test
	void toRenameTest() {
		PrintStream originalOut = System.out;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		RenameMethod renameMethod = new RenameMethod();
		try {
			System.setOut(new PrintStream(baos));

			renameMethod.toRename();
		} finally {
			System.setOut(originalOut);
		}

		String expected = "This should be renamed." + System.lineSeparator();
		assertEquals(expected, baos.toString());
	}
}

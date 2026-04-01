import static org.junit.Assert.*;

import migration.ClassForTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassForTestTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Readying!");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Nothing!");
	}

	@Test
	public void toBeTested() {
		assertEquals(10000, ClassForTest.toBeTested());
	}
}

import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClassForTestTest {

	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("Readying!");
	}

	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("Nothing!");
	}

	@Test
	public void toBeTested() {
		assertEquals(10000, ClassForTest.toBeTested());
	}
}

package de.masterzoo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ZooTest {
	Zoo zoo;

	@BeforeEach
	public void setUp() throws Exception {
		zoo = new Zoo();
	}

	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("Nothing!");
	}

	@Test
	public void dummyTest() {
		assertTrue(zoo.dummy());
	}

}

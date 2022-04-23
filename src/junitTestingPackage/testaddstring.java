package junitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddstring {

	@Test
	public void test() {
		junitfunction junitstring = new junitfunction();
		String result = junitstring.addstrings("capstone", "project");
		assertEquals("capstoneproject", result);
	}

}

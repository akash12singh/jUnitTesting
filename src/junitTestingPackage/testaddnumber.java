package junitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddnumber {

	@Test
	public void test() {
		junitfunction junit = new junitfunction();
		int result = junit.addnumber(100, 200);
		assertEquals (300,result);
	}

}

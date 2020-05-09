package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction junit=new jUnitFunction();
		int actual_output=junit.addNumbers(400, 500);
		assertEquals(900,actual_output);

	}

}

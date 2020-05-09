package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junitstrings=new jUnitFunction();
		String actual_output=junitstrings.addStrings("capstone", "project");
		assertEquals("capstoneproject",actual_output);

	}

}

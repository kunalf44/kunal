package com.test.unittest.first;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WolfTest {

	
	@Test
	void test1() {
		Wolf w = new Wolf();
		assertEquals(" ", w.modifiedwalk(),"Message returned is OK");
	}

}

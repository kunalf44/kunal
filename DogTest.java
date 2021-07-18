package com.test.unittest.first;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DogTest {

	
	@Test
	void test1() {
		Dog d = new Dog();
		assertEquals(" ", d.modifiedwalk(),"Message returned is OK");
	}
}

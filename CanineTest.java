package com.test.unittest.first;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CanineTest {
	@Test
	void test1() {
		Canine c = new Canine();
		assertEquals(" ", c.modifiedwalk(),"Message returned is OK");
	}
	@Test
	void test2() {
		Canine c = new Canine();
		assertEquals("I walk on 4 legs", c.walk(),"Message returned is OK");
	}
	@Test
	void test3() {
		Canine c = new Canine();
		assertEquals("I eat without hands", c.eat(),"Message returned is OK");
	}
}

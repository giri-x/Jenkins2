package com.giri.JunitSimple;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class CompareTest {

	@Test
	void testCompareString() {
		assertTrue(Compare.compareString("kee", "kee"));
	}
	@Test
	void testCompareString1() {
		assertFalse(Compare.compareString("Keer", "kee"));
	}

}

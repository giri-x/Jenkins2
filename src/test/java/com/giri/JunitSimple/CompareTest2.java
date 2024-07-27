package com.giri.JunitSimple;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class CompareTest2 {

	@Test
	void testCompareString() {
		assertTrue(Compare.CompareString("kee", "kee"));
	}
	@Test
	void testCompareString1() {
		assertFalse(Compare.CompareString("Keer", "kee"));
	}

}

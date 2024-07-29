package com.giri.junittest;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import com.giri.junitsimple.Compare;

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

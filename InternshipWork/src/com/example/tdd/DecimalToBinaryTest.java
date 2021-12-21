package com.example.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class DecimalToBinaryTest {

	@Test
	public void SingleDigitTest() {
		assertEquals(new Decimal(9).toBinary(),1001);
	}
	
	@Test
	public void DoubleDigitTest() {
		assertEquals(new Decimal(99).toBinary(),1100011);
	}
	
	@Test
	public void ThreeDigitTest() {
		assertEquals(new Decimal(999).toBinary(),1111100111);
	}

}

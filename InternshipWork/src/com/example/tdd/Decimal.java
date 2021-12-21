package com.example.tdd;

public class Decimal {
	
	private int dec;

	public Decimal(int dec){
		this.dec = dec;
	}

	public int toBinary() {
		return Integer.parseInt(Integer.toBinaryString(dec));
	}
	
	

}

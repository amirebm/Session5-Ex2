package com.personal.Computer;

public class Ram extends Goods{
	
	private int Frequency=1;
	private String RamType="a";
	

	public int getFrequency() {
		return Frequency;
	}

	public void setFrequency(int frequency) {
		Frequency = frequency;
	}

	public String getRamType() {
		return RamType;
	}

	public void setRamType(String ramType) {
		RamType = ramType;
	}

	public Ram(int frequency, String ramType) {
		super();
		Frequency = frequency;
		RamType = ramType;
	}
	
	public Ram() {
		super();
	}

	
	
	

}

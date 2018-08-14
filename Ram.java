package com.personal.Computer;

public class Ram extends HardWare {

	private int Frequency;
	private String RamType;
	
	public Ram() {
	}

	public Ram(int Frequency, String RamType, int ProductionYear, String hardwareName , int Price) {

		this.Frequency = Frequency;
		this.RamType=RamType;
        
		this.ProductionYear = ProductionYear;
		this.hardwareName = hardwareName;
		this.Price = Price;

	}
	
	public Ram(int Frequency, String RamType, int ProductionYear, String hardwareName, int price, boolean Guarantee, String CountryMade) {

		this.Frequency = Frequency;
		this.RamType=RamType;
        
		this.ProductionYear = ProductionYear;
		this.hardwareName = hardwareName;
		this.Price = price;
		this.Guarantee = Guarantee;
		this.CountryMade = CountryMade;

}

	@Override
	public void running(boolean onOroff) {

		if (onOroff == true)
			System.out.println("the RAM is working");
		else
			System.out.println("the RAM is  not working");

	}


	public int getFrequency() {
		return Frequency;
	}

	public void setFrequency(int frequency) {
		this.Frequency = frequency;
	}

	public String getRamType() {
		return RamType;
	}

	public void setRamType(String ramType) {
		this.RamType = ramType;
	}

	@Override
	public String toString() {

		return Frequency + "  " + RamType + "  " + ProductionYear + " " + hardwareName + " " + Price;

	}

	@Override
	public String connected(boolean connection) {

		this.connection = connection;

		if (this.connection == true)

			return "the Ram is connected";

		else
			return "the Ram is not connected";

	}

}

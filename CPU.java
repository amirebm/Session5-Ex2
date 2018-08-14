package com.personal.Computer;

public class CPU extends HardWare {

	private int GigaHerts;
	private int ProcessorNum;

	public CPU() {
	}

	public CPU(int GigaHerts, int ProcessorNum, int ProductionYear, String hardwareName, int Price) {

		this.GigaHerts = GigaHerts;
		this.ProcessorNum = ProcessorNum;

		this.ProductionYear = ProductionYear;
		this.hardwareName = hardwareName;
		this.Price = Price;

	}

	public CPU(int GigaHerts, int ProcessorNum, int ProductionYear, String hardwareName, int price, boolean Guarantee,
			String CountryMade) {

		this.GigaHerts = GigaHerts;
		this.ProcessorNum = ProcessorNum;

		this.ProductionYear = ProductionYear;
		this.hardwareName = hardwareName;
		this.Price = price;
		this.Guarantee = Guarantee;
		this.CountryMade = CountryMade;

	}

	@Override
	public void running(boolean onOroff) {

		if (onOroff == true)
			System.out.println("the CPU is working");
		else
			System.out.println("the CPU is  not working");

	}

	@Override
	public String toString() {

		return GigaHerts + "  " + ProcessorNum + "  " + ProductionYear + " " + hardwareName + " " + Price;

	}

	@Override
	public String connected(boolean connection) {

		this.connection = connection;

		if (this.connection == true)

			return "the CPU is connected to the Mother Board";

		else
			return "the CPU is not connceted to the Mother Board";

	}

}

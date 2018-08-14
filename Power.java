package com.personal.Computer;

public class Power extends HardWare {
	
	private String PowerType;
	
	public Power() {}

	public Power(String PowerType, int ProductionYear, String hardwareName , int Price) {

		this.PowerType=PowerType;
		
		this.ProductionYear = ProductionYear;
		this.hardwareName = hardwareName;
		this.Price = Price;

	}
	
	public Power(String PowerType, int ProductionYear, String hardwareName, int price, boolean Guarantee, String CountryMade) {

		this.PowerType = PowerType;
        
		this.ProductionYear = ProductionYear;
		this.hardwareName = hardwareName;
		this.Price = price;
		this.Guarantee = Guarantee;
		this.CountryMade = CountryMade;

}

	@Override
	public void running(boolean onOroff) {

		if (onOroff == true)
			System.out.println("the power is working");
		else
			System.out.println("the power is not working");

	}
	
	@Override
	public String toString() {

		return PowerType + "  " + ProductionYear + " " + hardwareName + " " + Price;


}

	@Override
	public String connected(boolean connection) {
		
		this.connection=connection;
		
		if (this.connection==true)
		
		return "the Power is connected to the devices";
		
		else
			return "the DVD Rom is not connected to the devices";



	}

}
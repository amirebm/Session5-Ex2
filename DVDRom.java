package com.personal.Computer;

public class DVDRom extends HardWare {

	String ElectConnector ;
	
	Power power= new Power();
	
	public DVDRom() {}
	
	public DVDRom(String ElectConnector,int ProductionYear, String hardwareName , int Price) {

		this.ElectConnector=ElectConnector;
		
		this.ProductionYear = ProductionYear;
		this.hardwareName = hardwareName;
		this.Price = Price;

	}
	
	public DVDRom(String ElectConnector, int ProductionYear, String hardwareName, int price, boolean Guarantee, String CountryMade) {

		this.ElectConnector = ElectConnector;
        
		this.ProductionYear = ProductionYear;
		this.hardwareName = hardwareName;
		this.Price = price;
		this.Guarantee = Guarantee;
		this.CountryMade = CountryMade;

}

	
	
	public void readingCD() {
		
		
	}
	
	
	@Override
	public void running(boolean onOroff) {

		if (onOroff == true)
			System.out.println("the DVD ROM is working");
		else
			System.out.println("the DVD ROM is  not working");

	}
	
	@Override
	public String toString() {

		return ElectConnector + "  " + ProductionYear + " " + hardwareName + " " + Price;


}

	 
	@Override
	public String connected(boolean connection) {
		
		this.connection=connection;
		
		if (this.connection==true)
		
		return "the DVD Rom is connected";
		
		else
			return "the DVD Rom is not connected";



	}


	
}
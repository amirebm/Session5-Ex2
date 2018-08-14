package com.personal.Computer;

public class HardDisk  extends HardWare{

	private int size;

	public HardDisk() {}
	
	public HardDisk(int size) {
		this.size = size;
	}
	
	public HardDisk(int  size, int ProductionYear, String hardwareName , int Price) {

		this.size=size;
		
		this.ProductionYear = ProductionYear;
		this.hardwareName = hardwareName;
		this.Price = Price;

	}
	
	public HardDisk(int  size, int ProductionYear, String hardwareName, int price, boolean Guarantee, String CountryMade) {

		this.size = size;
        
		this.ProductionYear = ProductionYear;
		this.hardwareName = hardwareName;
		this.Price = price;
		this.Guarantee = Guarantee;
		this.CountryMade = CountryMade;

}

	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public void running(boolean onOroff) {

		if (onOroff == true)
			System.out.println("the hard disk is working");
		else
			System.out.println("the hard disk is not working");

	}

	@Override
	public String toString() {

		return size + "  " + ProductionYear + " " + hardwareName + " " + Price;
	}

	@Override
	public String connected(boolean connection) {
		
		this.connection=connection;
		
		if (this.connection==true)
		
		return "the HardDisk is connected";
		
		else
			return "the HardDisk is not connected";

	}

	
	
}

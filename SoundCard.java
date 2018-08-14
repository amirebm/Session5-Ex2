package com.personal.Computer;

public class SoundCard extends HardWare {

	private int Frequency;
	private int capacity;

	
	public SoundCard() {}	
	
	
	public SoundCard(int frequency, int capacity, int ProductionYear, String hardwareName, int price ) {

		this.Frequency = frequency;
		this.capacity = capacity;
		
		this.ProductionYear = ProductionYear;
		this.hardwareName = hardwareName;
		this.Price = price;

	}

	public SoundCard(int Frequency, int capacity,int ProductionYear, String hardwareName, int price, boolean Guarantee, String CountryMade) {

		this.Frequency = Frequency;
		this.capacity=capacity;
        
		this.ProductionYear = ProductionYear;
		this.hardwareName = hardwareName;
		this.Price = price;
		this.Guarantee = Guarantee;
		this.CountryMade = CountryMade;
	}

	public int getFrequency() {
		return Frequency;
	}

	public void setFrequency(int frequency) {
		this.Frequency = frequency;
	}

	public int getcapacity() {
		return capacity;
	}

	public void setcapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public void running(boolean onOroff) {

		if (onOroff == true)
			System.out.println("the Sound Card is working");
		else
			System.out.println("the Sound Card is  not working");

	}

	
	@Override
	public String toString() {

		return Frequency + "  " + capacity + "  " 
		+ ProductionYear + " " + hardwareName + " " + Price;
		

	}


		
	@Override
	public String connected(boolean connection) {
		
		this.connection=connection;
		
		if (this.connection==true)
		
		return "the Sound Card Rom is connected";
		
		else
			return "the Sound Card is not connected";



	}
}

	
	

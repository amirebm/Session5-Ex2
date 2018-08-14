package com.personal.Computer;

public class GraphicCard extends HardWare {
	
	private int hdmi;
	private String connector;
	public GraphicCard() {
	}
	public GraphicCard(int hdmi, String connector) {
		this.hdmi = hdmi;
		this.connector = connector;
	}
	
	public GraphicCard(int hdmi, String connector, int ProductionYear, String hardwareName , int Price) {

		this.hdmi = hdmi;
		this.connector = connector;

		this.ProductionYear = ProductionYear;
		this.hardwareName = hardwareName;
		this.Price = Price;

	}

	public GraphicCard(int hdmi, String connector, int ProductionYear, String hardwareName, int price, boolean Guarantee, String CountryMade) {

		this.hdmi = hdmi;
		this.connector = connector;

		this.ProductionYear = ProductionYear;
		this.hardwareName = hardwareName;
		this.Price = price;
		this.Guarantee = Guarantee;
		this.CountryMade = CountryMade;

	}
	public int getHdmi() {
		return hdmi;
	}
	public void setHdmi(int hdmi) {
		this.hdmi = hdmi;
	}
	public String getConnector() {
		return connector;
	}
	public void setConnector(String connector) {
		this.connector = connector;
	}
	
	@Override
	public void running(boolean onOroff) {

		if (onOroff == true)
			System.out.println("the Graphic Card is working");
		else
			System.out.println("the Graphic Card is not working");

	}

	@Override
	public String toString() {

		return hdmi+ "  " + connector + "  " + ProductionYear + " " + hardwareName + " " + Price;

	}

	@Override
	public String connected(boolean connection) {

		this.connection = connection;

		if (this.connection == true)

			return "the Graphic Card is connected to the Mother Board";

		else
			return "the Graphic Card is not connceted to the Mother Board";

	}


	

}

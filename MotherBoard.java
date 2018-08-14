package com.personal.Computer;

public class MotherBoard extends HardWare{
	
	String PlatFormName;
	String SocketName;
	String ChipSetName;
	int GraphicSlat;
	int SlatNum;
	int PortLan;
	
	public MotherBoard() {}
	
	public MotherBoard(String platFormName, String socketName, String chipSetName) {
		this.PlatFormName = platFormName;
		this.SocketName = socketName;
		this.ChipSetName = chipSetName;
		
		
		}
	
	
	
	public MotherBoard(String platFormName, String socketName, String chipSetName, int graphicSlat, int slatNum,
			int portLan) {
		this.PlatFormName = platFormName;
		this.SocketName = socketName;
		this.ChipSetName = chipSetName;
		this.GraphicSlat = graphicSlat;
		this.SlatNum = slatNum;
		this.PortLan = portLan;
	}
	
	
	
	public MotherBoard(String platFormName, String socketName, String chipSetName,
			int graphicSlat, int slatNum,int portLan,int ProductionYear, String hardwareName , int price) {
  
		
	    this.PlatFormName = platFormName;
		this.SocketName = socketName;
		this.ChipSetName = chipSetName;
		this.GraphicSlat = graphicSlat;
		this.SlatNum = slatNum;
		this.PortLan = portLan;
	
		this.ProductionYear = ProductionYear;
		this.hardwareName = hardwareName;
		this.Price = price;

	}

	
	public MotherBoard(String platFormName, String socketName, String chipSetName,
			int graphicSlat, int slatNum,int portLan,int ProductionYear, String hardwareName, int price, boolean Guarantee, String CountryMade) {


		PlatFormName = platFormName;
		SocketName = socketName;
		ChipSetName = chipSetName;
		GraphicSlat = graphicSlat;
		SlatNum = slatNum;
		PortLan = portLan;
		
		this.ProductionYear = ProductionYear;
		this.hardwareName = hardwareName;
		this.Price = price;
		this.Guarantee = Guarantee;
		this.CountryMade = CountryMade;

	}


		
	public String getPlatFormName() {
		return PlatFormName;
	}
	
	
	public void setPlatFormName(String platFormName) {
		PlatFormName = platFormName;
	}
	public String getSocketName() {
		return SocketName;
	}
	public void setSocketName(String socketName) {
		SocketName = socketName;
	}
	public String getChipSetName() {
		return ChipSetName;
	}
	public void setChipSetName(String chipSetName) {
		ChipSetName = chipSetName;
	}
	public int getGraphicSlat() {
		return GraphicSlat;
	}
	public void setGraphicSlat(int graphicSlat) {
		GraphicSlat = graphicSlat;
	}
	public int getSlatNum() {
		return SlatNum;
	}
	public void setSlatNum(int slatNum) {
		SlatNum = slatNum;
	}
	public int getPortLan() {
		return PortLan;
	}
	public void setPortLan(int portLan) {
		PortLan = portLan;
	}
	
	@Override
	public void running(boolean onOroff) {

		if (onOroff == true)
			System.out.println("the Mother Board is working");
		else
			System.out.println("the Mother Board is  not working");

	}
	
	@Override
	public String toString() {

		return PlatFormName+ "  " + SocketName + " "+ChipSetName+ " " +	GraphicSlat+ " " +
		SlatNum+ " " + PortLan + "  " + ProductionYear + " " + hardwareName + " " + Price;

}

	@Override
	 String connected(boolean conMotherboard) {
		
		
		if (conMotherboard==true)
		
		return "the Motherboard is connected to the power";
		
		else
			return "the Motherboard is not connected to the power";

	}

	
	}
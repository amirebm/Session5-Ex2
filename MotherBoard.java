package com.personal.Computer;

public class MotherBoard extends Goods{
	
	String PlatFormName;
	String SocketName;
	String ChipSetName;
	int GraphicSlat;
	int SlatNum;
	int PortLan;
	
	
	
	public MotherBoard(String platFormName, String socketName, String chipSetName) {
		super();
		PlatFormName = platFormName;
		SocketName = socketName;
		ChipSetName = chipSetName;
	}
	public MotherBoard() {
		super();
	}
	CPU cpu=new CPU();
	Power power= new Power();
	
	Ram[] ram ;
	
	DVDRom dvdrom=new DVDRom();
	
	SoundCard scard=new SoundCard();
	
	GraphicCard gcard= new GraphicCard();
	
	HardDisk hdisk=new HardDisk();
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
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public Power getPower() {
		return power;
	}
	public void setPower(Power power) {
		this.power = power;
	}
	public Ram[] getRam() {
		return ram;
	}
	public void setRam(Ram[] ram) {
		this.ram = ram;
	}
	
	
	
	
	

}

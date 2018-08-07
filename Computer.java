package com.personal.Computer;

public class Computer {

	public static void main(String[] args) {


	ComputerCase cc= new ComputerCase();
	
	MotherBoard mb= new MotherBoard("AMD12","AMD socket","Amd  chipset");
	
	Goods g = new Goods(1980, "ram", 3000, true);
	System.out.println(g.toString());

	Ram[] r= new Ram[2];
	
	r[0]= new Ram();
	r[0].setFrequency(22222);
	r[0].setRamType("SSD");
	r[1]=new Ram();
	r[1].setFrequency(33333);
	r[1].setRamType("SSDdd");
	
	System.out.println(r[0].getFrequency() + " " + r[0].getRamType());
	
	Ram rr= new Ram();
	
	rr.setFrequency(4444);
	rr.setRamType("ffff");
	
	System.out.println(rr.getFrequency() + " " + rr.getRamType());
	
	mb.ram[0]= new Ram();
   mb.ram[0].setFrequency(20000);
   mb.ram[0].setRamType("INTEL");
	System.out.println(mb.ram[0].getFrequency() + " " + mb.ram[0].getRamType());

	mb.cpu.GigaHerts=10000;
	mb.cpu.running();
	mb.setProductionYear(1900);
	mb.setGoodsName("motherboard");
	mb.setPrice(5000);
	mb.setGarantee(true);
	g=mb;
	System.out.println(g);
	//g = new MotherBoard();

	}

}

package com.personal.Computer;

public class ComputerDeclare {

	public static void main(String[] args) {


	ComputerCase computerModel1= new ComputerCase();
	
	computerModel1.mBoard=new MotherBoard("Amd AM$", "INTEL", "INTEL", 3, 5, 2, 2018, "Mother board intel", 600000);
	computerModel1.cpu[0]= new CPU(1000,2,2018,"intel",50000,true,"USA");
	computerModel1.gcard= new GraphicCard(2, "hdmi", 2018, "N Vidia", 400000);
	computerModel1.hDisk=new HardDisk(1000, 2017, "SamSung", 300000, true, "Korea");
	computerModel1.ram[0]=new Ram(10000, "DDR3", 2018, "Adata", 300000, true, "China");
	computerModel1.ram[1]=new Ram(20000, "DDR3", 2017, "hiknes", 300000, true, "China");
	computerModel1.sCard= new SoundCard(40000, 20000, 2018, "Creative X-Fi Titanium", 200000, true, "China");
	computerModel1.power=new Power();

	
	
	
	System.out.println("Mother Board : "+ computerModel1.mBoard.toString()+ "\n");
	System.out.println("CPU : "+computerModel1.cpu[0].toString()+ "\n");
	System.out.println("Graphic Card : "+ computerModel1.gcard.toString()+ "\n");
	System.out.println("Hard Disk : "+ computerModel1.hDisk.toString()+"\n");
	System.out.println("Ram Number 1 : "+ computerModel1.ram[0].toString()+"\n");
	System.out.println("Sound Card : "+computerModel1.ram[1].toString()+"\n");
	System.out.println("Power : "+computerModel1.power.toString()+"\n");
	
	System.out.println("**********CHECKING THE HARDWARE IS CONNECTED OR NOT********** \n");
	
	for (int i = 0; i < 7; i++) {
		System.out.println( " " + computerModel1.CheckConnect(true, true, false, false, true, false, false)[i]);

	}
	
	System.out.println("***********CHECKING THE HARDWARE IS ON OR OFF**********\n");
	
	computerModel1.mBoard.running(true);
	computerModel1.cpu[0].running(false);	
	computerModel1.gcard.running(false);
	computerModel1.hDisk.running(true);
	computerModel1.sCard.running(true);
	
	
}

}

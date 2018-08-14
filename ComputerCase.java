package com.personal.Computer;

public class ComputerCase {
	
	MotherBoard mBoard= new MotherBoard();
	CPU[] cpu=new CPU[2];
	GraphicCard gcard=new GraphicCard();
	HardDisk hDisk=new HardDisk();
	Ram[] ram= new Ram[5];
	SoundCard sCard=new SoundCard();
	Power power= new Power();
	String[] temp =new String[7];

	public String[] CheckConnect(boolean MBoardCh, boolean cpuCh, boolean gcardCh, boolean hdiskHc , boolean ramHc, boolean scardCh,boolean powerCh) {
		
		
		temp[0]=mBoard.connected(MBoardCh);
		temp[1]=cpu[0].connected(cpuCh);
		temp[2]=gcard.connected(gcardCh);
		temp[3]=hDisk.connected(hdiskHc);
		temp[4]=ram[0].connected(ramHc);
		temp[5]=sCard.connected(scardCh);
		temp[6]=power.connected(powerCh);
		
		return temp;
	
	
	}
	 }

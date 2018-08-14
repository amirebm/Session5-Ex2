package com.personal.Computer;

public  abstract class HardWare {

	public int ProductionYear = 0;
	public String hardwareName = "";
	public int Price = 0;
	public boolean Guarantee=true;
	public String CountryMade = "";
	public boolean connection=false;

	 abstract void running(boolean onOroff);
	
	 abstract String connected(boolean connection) ;
	

}

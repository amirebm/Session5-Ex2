package com.personal.Computer;

public class Goods extends Company {
	
	private int ProductionYear;
	private String GoodsName;
	private int Price;
	private boolean Garantee;
	
	
	public Goods() {
	}
	
	public void running() {
		
		
		
	}
	
	public String toString() {
		
		return getProductionYear() + " " + getGoodsName()+ " " + getPrice() +  " " + isGarantee();
		
	}

	
	public Goods(int productionYear, String goodsName, int price, boolean garantee) {
		
		ProductionYear = productionYear;
		GoodsName = goodsName;
		Price = price;
		Garantee = garantee;
	}
	public int getProductionYear() {
		return ProductionYear;
	}
	public void setProductionYear(int productionYear) {
		ProductionYear = productionYear;
	}
	public String getGoodsName() {
		return GoodsName;
	}
	public void setGoodsName(String goodsName) {
		GoodsName = goodsName;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public boolean isGarantee() {
		return Garantee;
	}
	public void setGarantee(boolean garantee) {
		Garantee = garantee;
	}
	
	
	

}

package com.personal.Computer;

public class Company extends Country {
	
	
	
    private String NameOfCompany;
	
	private int idCompany;
	
	
//	public static void main(String[]args) {
//	
//		System.out.println("computer is running");
//		
//		
//	}
//	
	
	public Company() {
	}
	
	
	public Company(String countryName, int countryCode, String nameOfCompany, int idCompany) {
		super(countryName, countryCode);
		NameOfCompany = nameOfCompany;
		this.idCompany = idCompany;
	}

	public String getNameOfCompany() {
		return NameOfCompany;
	}

	public void setNameOfCompany(String nameOfCompany) {
		NameOfCompany = nameOfCompany;
	}

	public int getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(int idCompany) {
		this.idCompany = idCompany;
	}

	
	
	
	
	

}

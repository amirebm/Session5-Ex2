package com.personal.Computer;

public class Country {
	
	private String CountryName;
	private int CountryCode;
	
	
	public Country(String countryName, int countryCode) {
		
		CountryName = countryName;
		CountryCode = countryCode;
	}
	public String getCountryName() {
		return CountryName;
	}
	public Country() {
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public int getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(int countryCode) {
		CountryCode = countryCode;
	}
	
	
	
	

}

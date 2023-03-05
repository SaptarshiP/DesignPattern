package com.psja.AdapterDesign;

public class Person {

	private PhoneInterface phoneAdapter;
	
	public void setPhoneAdapter( PhoneInterface phoneAdapter ) {
		this.phoneAdapter = phoneAdapter;
	}
	
	
	public void wantToCharge() {
		phoneAdapter.charge();
	}
}

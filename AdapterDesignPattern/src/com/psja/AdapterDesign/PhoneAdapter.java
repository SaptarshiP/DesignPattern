package com.psja.AdapterDesign;

import com.psja.api.KeypadPhone;

public class PhoneAdapter implements PhoneInterface{

	@Override
	public void charge() {
		KeypadPhone keyPadPhone = new KeypadPhone();
		keyPadPhone.chargeWithSmallPin();
		
	}
}

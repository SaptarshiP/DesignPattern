package com.psja;
 
import static java.lang.System.out;

import com.psja.AdapterDesign.Person;
import com.psja.AdapterDesign.PhoneAdapter;
import com.psja.AdapterDesign.PhoneInterface;

public class AdapterDesignPattern {

	public static void main( String args[] ) {
		out.println( "In adapter design pattern" );
		PhoneInterface phoneInterface = new PhoneAdapter();
		Person person = new Person();
		person.setPhoneAdapter( phoneInterface );
		person.wantToCharge();
	}
}

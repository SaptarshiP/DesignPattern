package com.psja;

import static java.lang.System.out;

import com.psja.BuilderStyle.SmartPhoneBuilder;

public class BuilderStylePattern {

	public static void main( String args[] ) {
		out.println("Here");
		BuilderStylePattern builderStylePattern = new BuilderStylePattern();
		BuilderCheck builderCheck = builderStylePattern.new BuilderCheck();
		builderCheck.createBuilderObject();

	}
	class BuilderCheck{
		
		public void createBuilderObject() {
			SmartPhoneBuilder smartPhoneBuilder = SmartPhoneBuilder
														.builder()
														.Camera( "1 mega pixel" )
														.BatteryCapacity("1223")
														.build();
			out.println( smartPhoneBuilder );
		}
	}
}

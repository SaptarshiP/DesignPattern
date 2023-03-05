package com.psja.ProxyDesign;

public class CustomizedException extends Exception{

	private Exception exp;
	private String errorId;
	private String errorName;
	
	CustomizedException(){}
	
	CustomizedException( Exception exp, String errorId, String errorName ){
		super( exp );
		this.exp = exp;
		this.errorId = errorId;
		this.errorName = errorName;
	}
	
	public static CustomizedException builder() {
		return new CustomizedException();
	}
	
	public CustomizedException Exp( Exception exp ) {
		this.exp = exp;
		return this;
	}
	public CustomizedException ErrorId( String errorId ) {
		this.errorId = errorId;
		return this;
	}
	public CustomizedException ErrorName( String errorName ) {
		this.errorName = errorName;
		return this;
	}
	
	@Override
	public String getMessage() {
		return "Error Id:" + this.errorId + 
					", Error Message:" + this.errorName + 
					", Exception" + this.exp.getMessage();
	}
	public CustomizedException build() {
		return new CustomizedException( this.exp, this.errorId, this.errorName );
	}
	
}

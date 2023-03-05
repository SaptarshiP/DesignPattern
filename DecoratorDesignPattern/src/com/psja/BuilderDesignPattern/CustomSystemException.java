package com.psja.BuilderDesignPattern;

public class CustomSystemException extends Exception{

	private String errorId;
	private String errorName;
	private Exception exp;
	
	private CustomSystemException() {}
	private CustomSystemException( String errorId, String errorName, Exception exp ) {
		super( exp );
		this.errorId = errorId;
		this.errorName = errorName;
		this.exp = exp;
	}
	
	public static CustomSystemException builder() {
		return new CustomSystemException();
	}
	public CustomSystemException ErrorId( String errorId ) {
		this.errorId = errorId;
		return this;
	}
	public CustomSystemException ErrorName( String errorName ) {
		this.errorName = errorName;
		return this;
	}
	public CustomSystemException Exp( Exception exp ) {
		this.exp = exp;
		return this;
	}
	public CustomSystemException build() {
		return new CustomSystemException( this.errorId, this.errorName, this.exp );
	}
	
	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append( "ErrorId:" +this.errorId+ 
								",ErrorName:" +this.errorName+ 
								",Exception:" +this.exp.getMessage() );
		return strBuilder.toString();
	}
}

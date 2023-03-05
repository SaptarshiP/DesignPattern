package com.psja.Prototype.design;

public class Books {

	private String bookId;
	private String bookName;
	
	public void setBookId( String bookId ) {
		this.bookId = bookId; 
	}
	public String getBookId() {
		return this.bookId;
	}
	
	public void setBookName( String bookName ) {
		this.bookName = bookName;
	}
	public String getBookName() {
		return this.bookName;
	}
	
	@Override
	public String toString() {
		
		StringBuilder strBuilder = new StringBuilder( "Book Id:"+ this.bookId +
															", Book Name:"+this.bookName+" " );
		return strBuilder.toString();
	}
}

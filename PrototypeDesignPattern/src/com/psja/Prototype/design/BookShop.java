package com.psja.Prototype.design;

import java.util.List;
import java.util.ArrayList;

public class BookShop implements Cloneable{

	private String bookShopId;
	private String bookShopName;
	private List< Books > bookList = new ArrayList<>();
	
	public void setBookShopId( String bookShopId ) {
		this.bookShopId = bookShopId;
	}
	public String getBookShopId() {
		return this.bookShopId;
	}
	
	public void setBookShopName( String bookShopName ) {
		this.bookShopName = bookShopName;
	}
	public String getBookShopName( String bookShopName ) {
		return this.bookShopName;
	}
	
	public void setBookList( List<Books> bookList ) {
		this.bookList = bookList;
	}
	public List< Books > getBookList() {
		return bookList;
	}
	
	@Override
	public Object clone() {
		
		BookShop bookShop = new BookShop();
		bookShop.setBookShopId( this.bookShopId );
		bookShop.setBookShopName( this.bookShopName );
		
		List< Books > tempBookList = new ArrayList<>();
		tempBookList.addAll( this.bookList );
		bookShop.setBookList( tempBookList );
		
		return bookShop;
	}
	
	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append( "Book Shop Id:" + this.bookShopId + ",Book Shop Name:" + this.bookShopName + ",Book:[" );
		for ( Books books : bookList ) {
			strBuilder.append( books.toString() );
		}
		strBuilder.append( "]" );
		return strBuilder.toString();
	}
	
	public BookShop getBookShop() {
		Books books = null;
		List< Books > tempBookList = new ArrayList<>();
 		for ( Integer i = 1; i<10; i++ ) {
			books = new Books();
			books.setBookId(i.toString());
			books.setBookName("Test"+i.toString());
			tempBookList.add(books);
		}
 		BookShop bookShop = new BookShop();
 		bookShop.setBookShopId( "TestBookShopId1" );
 		bookShop.setBookShopName( "TestBookShopName" );
 		bookShop.setBookList( tempBookList );
		
 		return bookShop;
	}
}

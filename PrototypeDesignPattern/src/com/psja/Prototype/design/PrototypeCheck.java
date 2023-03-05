package com.psja.Prototype.design;

import static java.lang.System.out;

public class PrototypeCheck {

	public static void check() {
		
		BookShop bookShop = new BookShop();
		bookShop = bookShop.getBookShop();
		Integer i = 5;
		BookShop bookShop2  = bookShop;
		check2( bookShop, i );
		bookShop.getBookList().remove(3);
		out.println( bookShop );
		out.println( bookShop2 );
		out.println( i );
	}
	
	public static void check2( BookShop bookShop, Integer num ) {
		BookShop bookShop3 = bookShop;
		bookShop3.getBookList().remove(0) ;
		out.println( bookShop3 );
		num = 10;
		out.println( num );
	}
	
	public static void checkClone() {
		
		BookShop bookShop = new BookShop();
		bookShop = bookShop.getBookShop();
		BookShop bookShopClone = ( BookShop ) bookShop.clone();
		
		bookShopClone.setBookShopName( "Test3" );
		bookShopClone.getBookList().remove(0);
		out.println( bookShop );
		out.println( bookShopClone );
	}
	
}

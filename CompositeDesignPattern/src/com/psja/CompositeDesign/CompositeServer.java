package com.psja.CompositeDesign;

public class CompositeServer {

	public static void createComposite() {
		Component mouse = new Leaf( 1000, "mouse" );
		Component keyboard = new Leaf( 2000, "keyboard" );
		Component ram = new Leaf( 3000, "ram" );
		Component mem = new Leaf( 4000, "mem" );
		
		CompositeComponent pf = new CompositeComponent( "pf" );
		pf.addComponent( mouse );
		pf.addComponent( keyboard );
		CompositeComponent mb = new CompositeComponent( "mb" );
		mb.addComponent( ram );
		mb.addComponent( mem );
		CompositeComponent comp = new CompositeComponent( "comp" ); 
		comp.addComponent( pf );
		comp.addComponent( mb );
		
		pf.showPrice();
		System.out.println( "----------------------------------" );
		mb.showPrice();
		System.out.println( "----------------------------------" );
		comp.showPrice();
	}
}

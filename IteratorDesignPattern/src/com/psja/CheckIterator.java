package com.psja;

import java.util.Arrays;
import java.util.List;

import com.psja.iterator.MaximumArrayList;
import com.psja.iterator.MyContainer;
import com.psja.iterator.MyIterator;
import com.psja.iterator.DepthFirstSearch.DepthFirst;

public class CheckIterator {

	public static void checkMethod() {
		
		List< Integer > numList = Arrays.asList( 3, 2, 5, 4, 1, 6 );
		MyContainer myContainer = new MaximumArrayList();
		myContainer.createList( numList );
		
		MyIterator myIterator = myContainer.getIterator();
		for ( int i = 0; i<numList.size(); i++ )
			System.out.println( myIterator.getNext() );
	}
	
	public static void checkDepthFirstSearch() {
		DepthFirst<Integer> depthFirstSearchInteger = new DepthFirst<>();
		depthFirstSearchInteger.setData(1);
		System.out.println( depthFirstSearchInteger.getData() );
		DepthFirst<String> depthFirstSearchString = new DepthFirst<>();
		depthFirstSearchString.setData( "psja" );
		System.out.println( depthFirstSearchString.getData() );
	}
	
}

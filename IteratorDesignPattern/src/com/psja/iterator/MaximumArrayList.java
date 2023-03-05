package com.psja.iterator;

import java.util.List;
import java.util.ArrayList;

public class MaximumArrayList implements MyContainer{
	
	private List< Integer > objList = new ArrayList<>();

	@Override
	public void createList( List< Integer > demoList ) {
		this.objList.addAll( demoList );
	}
	@Override
	public MyIterator getIterator() {
		return new MyIterable();
	}
	
	class MyIterable implements MyIterator{
		Integer i = 0;
		
		@Override
		public Boolean checkNext( Integer j ) {
			if ( j < objList.size() )
				return Boolean.TRUE;
			return Boolean.FALSE;
		}
		@Override
		public Integer getNext() {
			
			Integer tempSmallNumber = objList.get( i );
			Integer tempSmallNumberIndex = i;
			Integer j = i+1;
			while ( checkNext(j) ) {
				if ( tempSmallNumber > objList.get( j ) ) {
					tempSmallNumber = objList.get( j );
					tempSmallNumberIndex = j;
				}
				j++;
			}
			objList.set( tempSmallNumberIndex , objList.get( i ) );
			objList.set( i, tempSmallNumber );
			
			System.out.println( objList + ":" + i );
			i++;
			return tempSmallNumber;
		}
	}
}

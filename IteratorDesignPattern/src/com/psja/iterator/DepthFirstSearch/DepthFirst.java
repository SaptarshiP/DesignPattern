package com.psja.iterator.DepthFirstSearch;

import java.util.List;
import java.util.Stack;

import com.psja.iterator.MyContainer;
import com.psja.iterator.MyIterator;

public class DepthFirst implements MyContainer {
	
	Node<Integer> node = null;
	
	@Override
	public void createList( List< Integer > demoList ) {
		Integer i = 0;
		while ( i < demoList.size() ) {
			node = createNode( node, demoList.get(i) );
			i++;
		}
	}
	private Node<Integer> createNode( Node<Integer> node, Integer value ) {

		if ( node == null )
			return new Node<Integer>( value, null, null );
		else if ( node.getValue() >= value )
			node.setLeftNode( createNode( node.getLeftNode(), value ) );
		else if ( node.getValue() < value )
			node.setRightNode( createNode( node.getRightNode(), value ) );
		return node;
	}
	@Override
	public MyIterator getIterator() {
		return new DepthFirstSearchIterator();
	}
	public class DepthFirstSearchIterator implements MyIterator {

		Stack<Node<Integer>> stack = new Stack<>();
		@Override
		public Boolean checkNext( Integer j ) {
			return null;
		}
		@Override
		public Integer getNext() {
			
			traverse( node, stack );
			return null;
		}
		
		private Node<Integer> traverse( Node<Integer> node, Stack<Node<Integer>> stack ) {
			
			if ( node == null ) {
				Node<Integer> retNode = stack.pop();
				System.out.println( retNode.getValue() );
				return retNode;
			}
			stack.push( node );
			node = traverse( node.getLeftNode(), stack );
			node = traverse( node.getRightNode(), stack );
			return node;
		}
	}
}

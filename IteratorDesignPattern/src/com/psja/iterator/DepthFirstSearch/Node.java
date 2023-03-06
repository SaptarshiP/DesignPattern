package com.psja.iterator.DepthFirstSearch;

public class Node<T> {
	private T value;
	private Node<T> leftNode;
	private Node<T> rightNode;
	
	Node( T value, Node<T> leftNode, Node<T> rightNode ){
		this.value = value;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}
	
	public void setValue( T value ) {
		this.value = value;
	}
	public void setLeftNode( Node<T> leftNode ) {
		this.leftNode = leftNode;
	}
	public void setRightNode( Node<T> rightNode ) {
		this.rightNode = rightNode;
	}
	public T getValue() {
		return this.value;
	}
	public Node<T> getLeftNode(){
		return this.leftNode;
	}
	public Node<T> getRightNode(){
		return this.rightNode;
	}
}

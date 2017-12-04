package complicatedHashTable;

import java.util.ArrayList;

public class Tree<Key extends Comparable<Key>,Value> {
	
	//fields
	private Key key;
	private Value value;
	private TNode<Key, Value> root;
	private TNode<Key, Value> leftChild;
	private TNode<Key, Value> rightChild;
	
	//constructors
	public Tree(Key key, Value value)
	{
		this.root = new TNode<Key, Value>(key,value);
	}
	
	
	//methods
	protected void insert(Key newKey, Value newValue)
	{
		if (this.root == null)
		{
			this.root = new TNode<Key,Value>(newKey, newValue);
		}
		else
		{
		this.root.insertNode(newKey, newValue);
		}
	}
	
	protected Value get(Key newKey)
	{
		return this.root.getNode(newKey);
	}
	
	protected void removeFromTree(Key newKey)
	{
		this.root = this.root.deleteNode(newKey);
	}
	

	//getter methods
	/*should I not have getter methods to protect the wrapped class?
	 * 
	 */
	protected TNode<Key, Value> getRoot()
	{
		return this.root;
	}
	
	protected Key getRootKey()
	{
		return this.root.getKey();
	}
	
	
	protected Value getRootValue()
	{
		return this.root.getValue();
	}
	
	protected TNode<Key,Value> getLeftNode()
	{
		return this.leftChild;
	}
	
	protected TNode<Key,Value> getRightNode()
	{
		return this.rightChild;
	}
	

}

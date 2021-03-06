package complicatedHashTable;

import java.util.ArrayList;

public class TNode<Key extends Comparable<Key>, Value> implements Comparable<TNode<Key,Value>> {
	
	//Fields
	private Key key;
	private Value value;
	private TNode<Key, Value> leftChild;
	private TNode<Key, Value> rightChild;
	
	//Constructors
	public TNode(Key key, Value val)
	{
		this.key = key;
		this.value = val;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	public TNode(Key key)
	{
		this.key = key;
		this.value = null;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	//methods
	//The insertNode method adds a new node to the tree.
	protected void insertNode(Key newKey, Value newValue)
	{
		if (this.key.compareTo(newKey) == 0)
		{
			this.value = newValue;
		}//end of if
		else if (this.key.compareTo(newKey) == 1)
		{
			if (this.leftChild == null)
			{
				this.leftChild = new TNode<Key, Value>(newKey,newValue);
			}
			else
			{
				this.leftChild.insertNode(newKey, newValue);
			}
		}//end of else if
		else if (this.key.compareTo(newKey) ==  -1)
		{
			if (this.rightChild == null)
			{
				this.rightChild = new TNode<Key, Value>(newKey,newValue);
			}
			else
			{
				this.rightChild.insertNode(newKey, newValue);
			}
		}//end of second else if
	}//end of method
	
	//The getNode method returns a Node whose key matches the key provided in the method argument.
	protected Value getNode(Key newKey)
	{
		if (this.key.compareTo(newKey) == 0)
		{
			return this.value;
		}
		else if (this.key.compareTo(newKey) == 1)
		{
			if (this.hasLeftChild())
			{
				Value left = this.getLeftChild().getNode(newKey);
				if (left != null)
				{
					return left;
				}
			}
			else 
			{
				return null;
			}
		}
		else if (this.key.compareTo(newKey) == -1)
		{
			if (this.hasRightChild())
			{
				Value right = this.getRightChild().getNode(newKey);
				if (right != null)
				{
					return right;
				}
			}
			else 
			{
				return null;
			}
		}
		return null;
	}
	
	/*The deleteNode method deletes a Node whose key matches the key provided in the method argument.
	 * this method also restructures the tree so that the values continue to be postitioned in a way
	 * that is consistent with binary search trees.
	 */
	protected TNode<Key,Value> deleteNode(Key newKey)
	{
		if (this.key.compareTo(newKey) == 1)
		{
			if (this.hasLeftChild())
			{
				this.getLeftChild().deleteNode(newKey);
			}
			else
			{
			return null;
			}
		}
		
		else if (this.key.compareTo(newKey) == -1)
		{
			if (this.hasRightChild())
			{
				this.getRightChild().deleteNode(newKey);
			}
			else
			{
				return null;
			}
		}
		
		//else if statement deletes a node if keys match.
		else if (this.key.compareTo(newKey) == 0)
		{
			//node with only one child or no child
			if (this.leftChild == null)
			{
                return this.rightChild;
			}
            else if (this.rightChild == null)
            {
                return this.leftChild;
            }
            else
            {
			// node with two children: Gets the smallest node in the right subtree.
            TNode<Key, Value> minNode = this.minKeyValue(newKey);
            return minNode;
            }	
		}
		else
		{
			//key provided in argument does not match a key in the tree.
			return null;
		}
		return null;	
	}
	
	/*this method starts with the right subtree of a node and keeps going left
	 * in order to find the minimum value of the right subtree.
	 */
	  TNode<Key,Value> minKeyValue(Key newKey)
	  {
		//counter used so I can find node directly above minkey node
		int counter = 0; 
		
	    TNode<Key,Value> minKey = this.rightChild;
	        while (minKey.leftChild != null)
	        {
	            minKey = minKey.leftChild;
	            counter += 1;
	        }
	        
	        
	        /*if the minimum key value node has a right child than
	        the minimum key value nodes parent must make it's left
	        child = to the minimum keys right child
	        */
	        if (minKey.rightChild != null)
	        {
		        TNode<Key, Value> tempNode = minKey.rightChild;
		        TNode<Key, Value> parentNode = this.rightChild;
		        for (int i = 0; i < (counter-1); i += 1)
		        {
		        	parentNode = parentNode.leftChild;
		        }
		        parentNode.leftChild = tempNode;
	        }
	        
	        /*because minkey is going to replace a Node that is higher up the tree
	         *  we dont want to lose the higher up nodes children
	         */
	        minKey.rightChild = this.rightChild;
	        minKey.leftChild = this.leftChild;
	        
	        //minkey Node replaces node that called this method
	        return minKey;
	    }
	
	@Override
	public int compareTo(TNode<Key, Value> Node) {
		return key.compareTo(Node.key);
	}
	
	protected Boolean hasLeftChild()
	{
		return !(this.leftChild == null); //returns opposite of whatever statement returns
	}
	
	protected Boolean hasRightChild()
	{
		return !(this.rightChild == null); //returns opposite of whatever statement returns
	}
	
	//getter methods
	protected Key getKey()
	{
		return this.key;
	}
	
	protected String getKeyRepresentation()
	{
		return this.key.toString();
	}

	protected Value getValue()
	{
		return this.value;
	}
	
	protected TNode<Key,Value> getLeftChild()
	{
		return this.leftChild;
	}
	
	protected TNode<Key,Value> getRightChild()
	{
		return this.rightChild;
	}
	
	//setter methods
	protected void setLeftChild(TNode<Key,Value> node)
	{
		this.leftChild = node;
	}
	
	protected void setRightChild(TNode<Key,Value> node)
	{
		this.rightChild = node;
	}

}


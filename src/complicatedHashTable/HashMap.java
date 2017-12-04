package complicatedHashTable;

public class HashMap<Key extends Comparable<Key>,Value> {
	

	//fields
	private Tree<Key,Value> tree;
	
	//constructors
	public HashMap(Tree<Key,Value> tree)
	{
		this.tree = tree;
	}
	
	//methods
	public void put(Key newKey, Value newValue)
	{
		this.tree.insert(newKey, newValue);
	}
	
	public void get(Key newKey)
	{
		this.tree.get(newKey);
	}
	
	public void remove(Key newKey) 
	{
		this.tree.removeFromTree(newKey);
	}	
	
	
}

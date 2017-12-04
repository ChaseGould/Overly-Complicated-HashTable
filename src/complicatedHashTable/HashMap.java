package complicatedHashTable;

public class HashMap<Key extends Comparable<Key>,Value> {
	

	//fields
	private Tree tree;
	
	//constructors
	public HashMap(Tree tree)
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
	
	/*
	  public TNode remove(Key key){
	  
	  }
	 */
	
	
	
	
	
}

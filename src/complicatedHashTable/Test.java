package complicatedHashTable;

public class Test {

	public static void main(String[] args) {
		
		Key key1 = new Key(1,5);
		Key key2 = new Key(1,10);
		Key key3 = new Key(1,2);
		Key key4 = new Key(1,7);
		Key key5 = new Key(1,11);
		Key key6 = new Key(1,4);
		Key key7 = new Key(1,1);
		Key key8 = new Key(1,10);
		
		
		
		
		
		Integer inty = 3;
		Integer inty2 = 10;
		Integer inty3 = 5;
		Integer inty4 = 8;
		Integer inty5 = 16;
		Integer inty6 = 50;
		Integer inty7 = 50;
		Integer inty8 = 100;
		
		//testing delete method
		Tree<Key, Integer> tree1 = new Tree(key1, inty);
		tree1.insert(key2, inty2);
		tree1.insert(key3, inty3);
		tree1.insert(key4, inty4);
		tree1.insert(key5, inty5);
		tree1.removeFromTree(key1);
		System.out.println(tree1.getRootKey());
		TNode<Key,Integer> temp = tree1.getRoot();
		temp = temp.getRightChild();
		System.out.println(temp.getKeyRepresentation());
		temp = temp.getRightChild();
		System.out.println(temp.getKeyRepresentation());
		
		
		
		
		/*
		
		System.out.println("key1: " + key1.toString());
		System.out.println("key2: " + key2.toString());
		System.out.println("comparing key1 to key2 gives output: " + key1.compareTo(key2) + "\n");

		/*
		Tree<Key, Integer> tree1 = new Tree(key1, inty);	
		
		tree1.insert(key2, inty2);
		tree1.insert(key3, inty3);
		tree1.insert(key4, inty4);
		tree1.insert(key5, inty5);
		tree1.insert(key6, inty6);
		tree1.insert(key7, inty7);
		tree1.insert(key8, inty8);
		
		System.out.println("rootvalue: " + tree1.getRootValue());
		System.out.println("leftChild " + tree1.getRoot().getLeftChild());
		System.out.println("rightChild " + tree1.getRoot().getRightChild());
		
		System.out.println("value when tree tries to get key1: " + tree1.get(key1));
		System.out.println("value when tree tries to get key2: " + tree1.get(key2));
		System.out.println("value when tree tries to get key3: " + tree1.get(key3));
		System.out.println("value when tree tries to get key4: " + tree1.get(key4));
		System.out.println("value when tree tries to get key5: " + tree1.get(key5));
		System.out.println("value when tree tries to get key6: " + tree1.get(key6));
		System.out.println("value when tree tries to get key7: " + tree1.get(key7));
		System.out.println("value when tree tries to get key8: " + tree1.get(key8));
		
		*/
		
		
	}
}

package complicatedHashTable;

public class Key implements Comparable <Key> {

	//fields
	private Complex myComplexNum;
		
	
	//constructors
	public Key()
	{
		this.myComplexNum = new Complex(1,1);
	}
	
	public Key(double real, double imaginary)
	{
		this.myComplexNum = new Complex(real, imaginary);
		
	}
	
	//class methods
	public int compareTo(Key input) {
		if (this.myComplexNum.getReal().equals(input.myComplexNum.getReal())) {
			return (int) this.myComplexNum.getImaginary().compareTo(input.myComplexNum.getImaginary());
		}
		else
		{
			return (int) this.myComplexNum.getReal().compareTo(input.myComplexNum.getReal());
		}
	}
	
	public String toString()
	{
		return this.myComplexNum.toString();
	}
	
	//getter methods
	public Complex getMyComplexNum()
	{
		return this.myComplexNum;
	}
}



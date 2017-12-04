package complicatedHashTable;

public class Complex{
	
	//fields
	private Double real;
	private Double imaginary;
	
	//constructors
    public Complex() {
       this.real = 1.0;
       this.imaginary = 1.0;
    }
 
    public Complex(double r, double i) {
        this.real = r;
        this.imaginary = i;
     }

    //methods
    public String toString()
    {

    	if (imaginary > 0)
    	{
    		return real + " + " + imaginary + "i";
    	}
    	else
    	{
    		return real + " - " + imaginary + "i";
    	}
    }
    
    //getter methods
    protected Double getReal() 
    {
    	return this.real;
    }

    protected Double getImaginary() 
    {
    	return this.imaginary;
    }
}
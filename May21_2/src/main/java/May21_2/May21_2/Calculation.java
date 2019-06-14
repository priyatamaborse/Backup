package May21_2.May21_2;

/**
 * Hello world!
 *
 */
public class Calculation 
{
	public void division(int x,int y)
	{
		int z;
		if(y==0)
		{
			throw new ArithmeticException("Divide by 0");
		}
		else
			System.out.println("Division is :"+x/y);
	}
	
    public static void main( String[] args )
    {
    	System.out.println(10/0);
        System.out.println( "Hello World!" );
    }
}

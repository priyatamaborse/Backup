package default_static_method;

@FunctionalInterface
interface Circle
{
	public void test();
	public default void calculatearea()
	{
		System.out.println("interface calculatearea() method");
	}
	public static void draw()
	{
		System.out.println("interface draw() method");
	}
}

@FunctionalInterface
interface Rectangle
{
	public void test();
	public default void calculatearea()
	{
		System.out.println("interface calculatearea() method");
	}
	public static void draw()
	{
		System.out.println("interface draw() method");
	}
}
public class Program implements Circle,Rectangle
{

	@Override
	public void test() 
	{

	}
	
	@Override
	public void calculatearea() {
		System.out.println("class calculatearea() method");
		//developer can decide which class method to be called
		Circle.super.calculatearea();
		Rectangle.super.calculatearea();
	}

	public static void main(String[] args)
	{
		Program program=new Program();
		program.calculatearea();
		Circle.draw();
		Rectangle.draw();
		
	}


}

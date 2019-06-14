package method_reffernce;

@FunctionalInterface
interface Drawable
{
	public void draw();
}

@FunctionalInterface
interface Substractable
{
	public void substract();
}

public class Program 
{
	public Program() {
	System.out.println("ïn constructor");
	}
	public static void drawElephant()
	{
		System.out.println("drawing elephant");
	}
	
	public void substract()
	{
		System.out.println("In Substract");
	}
	
	public static void main(String[] args) 
	{
		//static method refference
		//we are providing draw method implementation 
		//no need to create object
		Drawable drawable=Program::drawElephant;
		drawable.draw();
		
		//Instance method refference
		Program program=new Program();
		Substractable substractable=program::substract;
		substractable.substract();
		
		//constructor reffernce
		Substractable program2=Program::new;
		program2.substract();
	}

}

package Abstractiondemo;
interface Drawablee
{
	void draw();
	default void message(){
		System.out.println("since jsvs 8, we cam specify method bisy using default");
}
	static int multiply(int a, int b)
	{
		return a*b;
	}
}
class Circle implements Drawablee
{

	@Override
	public void draw() {
		System.out.println("Drawing circle");
		
	}
	
}

public class DefaultMethodDemo {

	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.draw();
		circle.message();
		System.out.println(Drawablee.multiply(10,10));

	}
}

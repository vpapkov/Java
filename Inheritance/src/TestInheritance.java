
public class TestInheritance
{

	public static void main (String[] arg)
	
	{
		Animal a = new Animal ("Scary Animal");
		System.out.println("1" + a.getType());
		
		Dog d = new Dog("Dog", "Tyzik" , "Chivalla" ); 
		System.out.println(d.getType());
		d.bark();
		
		Animal tricky = new Dog("Dog", "Tyzik" , "Chivalla" ); 
		System.out.println("2" + tricky.getType());
//		tricky.bark();
	}
}


public class TestCar

{

	public static void main (String[] arg)
	
	{
		Cars a = new Cars("Camry", 6,  "Corrolla", "1CCorrolla441" , "1997" );
		System.out.println("The type is: " + a.MyMygetType()+ ", The year is: "  + a.getyear() + ", The model is: " + a.getModel() + ". And this car has " + a.MyMygetwheels() + " wheels.");
		
		Cars d = new Cars("RAV4", 6, "7777", "1998", "6"); 
		System.out.println("2 " + d.MyMygetType());

		
		Cars MyCar = new Cars("Munyfacktory3", 6, "7777", "1998", "6"); 
		System.out.println("3 " + MyCar.MyMygetType());
		
//		Cars MyCar = new Cars("Munyfacktory8", 6, "7777", "1998", "6"); 
//		System.out.println("3 " + MyCar.getType());
	}
}
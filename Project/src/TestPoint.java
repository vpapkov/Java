
public class TestPoint
{

	public static void main(String[] args)
	{
		Point p = new Point(5.0, 13.0);
		double distance = p.distanseFromOregin();
		System.out.println("Distance is " + distance);
		
		Point p2 = new Point();
		p2.setX(3.0);
		p2.setY(4.0);
		System.out.println("Distance is 1" + p2.distanseFromOregin());
	}

}

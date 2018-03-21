public class Cars extends Vehicle
{
	private String model;
	private String maker;
	private String year;	
	
	public Cars (String abType, int aaabbWheels,  String amodel , String amaker, String ayear)
	{
	super(abType, aaabbWheels);		
	model = amodel;
	maker = amaker;
	year = ayear;
	}
	
	public String getModel()
	{
		return model;
	}
	public String getMaker()
	{
		return maker;
	}
	public String getyear()
	{
		return year;
	}

}
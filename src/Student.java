
public class Student 
{
	private String name;
	private int gradeLevel;
	private int gradYear;
	private String phoneNumber;
	
	
	public Student (String n, int gL, int gY, String pN)
	{
		name = n;
		gradeLevel = gL;
		gradYear = gY;
		phoneNumber = pN;
	}
	
	public String getName()
	{
		return name;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public int getGradeLevel()
	{
		return gradeLevel;
	}
	public int getGradYear90()
	{
		return gradYear;
	}
	public void nextGrade()
	{
		gradeLevel++;
	}
	public void setPhoneNumber(String pN)
	{
		phoneNumber = pN;
	}
	
	
}

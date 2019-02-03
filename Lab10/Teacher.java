package Lab10;

public class Teacher extends Person
{
	private String[] courses;
	
	public Teacher(String name, String address)
	{
		super(name, address);
	}

	public String[] getCourses()
	{
		return courses;
	}

	public void setCourses(String[] courses)
	{
		this.courses = courses;
	}
	public boolean addCourse(String course)
	{
		return true;
	}
	public boolean removeCourse(String course)
	{
		return false;
	}
	public String toString()
	{
		return super.toString();
	}
}

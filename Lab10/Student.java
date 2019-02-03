package Lab10;

import java.util.Arrays;

public class Student extends Person
{
	private int numCourses;
	private String courses[];
	private int grades[];
	int sum = 0;
	private double average;
	
	public Student(String name, String address)
	{
		super(name, address);
	}
	
	public int getNumCourses()
	{
		return numCourses;
	}

	public void setNumCourses(int numCourses)
	{
		this.numCourses = numCourses;
	}

	public String[] getCourses()
	{
		return courses;
	}

	public void setCourses(String[] courses)
	{
		this.courses = courses;
	}

	public int[] getGrades()
	{
		return grades;
	}

	public void setGrades(int[] grades)
	{
		this.grades = grades;
	}

	public double getAverage()
	{
		return average;
	}

	public void setAverage(int average)
	{
		this.average = average;
	}
	public void addCourseGrade(String string, int i)
	{
		for(int x = 0; x < numCourses; x++)
		{
			courses[x] = string;
			grades[x] = i;
		}
	}
	public void printGrades()
	{
		for(int i = 0; i < 2; i++)
		{
			//System.out.println("Grades " + grades.toString());
		}
	}
	
	public String toString()
	{
		return super.toString();
	}
	
	public int getAverageGrade(int[] grades)
	{
		for(int i = 0; i < 2; i++)
		{
			average += grades[i];
		}
		average = average/grades.length;
		return (int) average;
	}
}

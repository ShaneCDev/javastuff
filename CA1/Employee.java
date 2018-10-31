package CA1;

public class Employee
{
	private String name;
	private int age;
	private String gender;
	private  String employeeType;
	private int employeeNumber;
	private static int numEmployees = 0;
	private Address employeeAddress;
	private Car employeeCar;
	
	public Employee(String name, int age, String gender, String employeeType, Address employeeAddress, Car car)
	{
		employeeNumber = numEmployees + 1000;
		numEmployees++;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.employeeType = employeeType;
		this.employeeCar = car;
		this.employeeAddress = employeeAddress;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public String getEmployeeType()
	{
		return employeeType;
	}
	public void setEmployeeType(String employeeType)
	{
		this.employeeType = employeeType;
	}
	public int getEmployeeNumber()
	{
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber)
	{
		this.employeeNumber = employeeNumber;
	}
	public static int getNumOfEmployees()
	{
		return numEmployees;
	}
	public static void setNumOfEmployees(int numberOfEmployees)
	{
		Employee.numEmployees = numberOfEmployees;
	}
	public Car getEmployeeCar()
	{
		return employeeCar;
	}
	/*public void setEmployeeCar(Car employeeCar)
	{
		this.employeeCar = employeeCar;
	}*/
	public String toString()
	{
		String temp = "Employee Name: " + name + "\n" + "Employee Number: " + employeeNumber +  "\n" + "Employee Age: " + age + "\n" + "Employee Gender: " + gender 
				+ "\n" + "Staff or Manager: " + employeeType + "\n" + "Employee Address: " + employeeAddress;	
			if(getEmployeeType().equalsIgnoreCase("Manager"))
			{
				return temp + "\n" + "Managerial Company Car: " + employeeCar;
			}
			else
			{
			return temp;
			}
	}
	
}

package CA1;
/*
This is a Human Relations menu which takes user input to create employees and puts said employees 
into an array and can be called to the screen on demand.
*/
import java.util.Scanner;

public class myHr
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		Employee empArray[] = new Employee[10];//Employee Array
		int userInput;
		String name;
		int age;
		String gender;
		String empType;
		/*
		 * String street; String cityOrTown; String county;
		 */
		Car managerCar = new Car(" ", " ");
		Address empAddress = new Address(" ", " ", " ");
		int carCounter = 0;
		do
		{
			System.out.println("************HR Menu***************");
			System.out.println("1. Create a new employee record");
			System.out.println("2. List all employees");
			System.out.println("3. List all non-Manager employees");
			System.out.println("4. List all Managers");
			System.out.println("5. List all company cars");
			System.out.println("6. Quit");
			System.out.println("Please enter a number between 1-6");
			userInput = input.nextInt();

			switch (userInput)
			{
			case 1:
				System.out.println("How many employee records would you like to create?");
				int empRecords = input.nextInt();
				if(empRecords > 10)
				{
					System.out.println("Error, can only make 10 records. Try again.");
				}
				else
				{
				for (int x = 0; x < empRecords; x++)//Creates employee objects and puts them into the array
				{
					System.out.println("Enter Employee's name: ");
					name = input.next();
					System.out.println("Enter Employee's age: ");
					age = input.nextInt();
					System.out.println("Enter Employee's gender ('Male' or 'Female'): ");
					gender = input.next();
					System.out.println("Enter Employee Type: ");
					empType = input.next();
					if (empType.equalsIgnoreCase("Staff") || empType.equalsIgnoreCase("Manager"))
					{
						System.out.println("Street: ");
						String street = input.next();
						System.out.println("City or Town: ");
						String cityOrTown = input.next();
						System.out.println("County: ");
						String county = input.next();
						empAddress = new Address(street, cityOrTown, county);
					}
					if (empType.equalsIgnoreCase("Manager"))//determines if the employee is eligible for a company car or not
					{
						System.out.println("Enter make of car: ");
						String makeOfCar = input.next();
						System.out.println("Colour: ");
						String carColour = input.next();
						managerCar = new Car(makeOfCar, carColour);
					}
					empArray[x] = new Employee(name, age, gender, empType, empAddress, managerCar);
				}
				}
				break;
			case 2:
				for (int x = 0; x < Employee.getNumOfEmployees(); x++)//prints all contents of the array
				{
					System.out.println(empArray[x]);
				}
				break;
			case 3:
				for (int x = 0; x < Employee.getNumOfEmployees(); x++)
				{
					if (empArray[x].getEmployeeType().equalsIgnoreCase("Staff"))//only prints employees that are of type staff from the array
					{
						System.out.println(empArray[x]);
					}
				}
				break;
			case 4:
				for (int x = 0; x < Employee.getNumOfEmployees(); x++)
				{
					if (empArray[x].getEmployeeType().equalsIgnoreCase("Manager"))//only prints employees that are of type manager from the array
					{
						System.out.println(empArray[x]);
					}
				}
				break;
			case 5:
				for (int x = 0; x < Employee.getNumOfEmployees(); x++)
				{
					if (empArray[x].getEmployeeType().equalsIgnoreCase("Manager"))//prints the make, colour, asset number and number of cars 
					{
						carCounter++;
					}
				}
				System.out.println("Make of Car(s) and colour: " + managerCar.toString());
				System.out.println("Number of Company Cars: " + carCounter);
				System.out.println("Car asset number: " + managerCar.getAssetNumber());
				break;
			case 6:
				System.out.println("Exiting program...");
				break;
			default:
				System.out.println(userInput + " is an invalid menu option");
				break;
			}
		} while (userInput != 6);
		input.close();
	}
}
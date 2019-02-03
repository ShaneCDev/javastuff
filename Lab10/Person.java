package Lab10;

public class Person {
	   // Instance variables
	   private String name;
	   private String address;
	   
	   // Constructor
	   public Person(String name, String address) {
	      this.name = name;
	      this.address = address;
	   }
	   public Person(String name)
	   {
		   this.name = name;
	   }
	   
	   // Getters
	   public String getName() {
	      return name;
	   }
	   public String getAddress() {
	      return address;
	   }
	   
	   public String toString() {
	      return name + "(" + address + ")";
	   }
	}
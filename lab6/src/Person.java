/**
 * @author C00261172 Huu Chi Huynh
 * @date 09/11/2021
 * @summary 
 * Person class
 */
public class Person {
	   // Variables
	   private String name;
	   private String address;
	   
	   // Constructors
	   public Person(String name, String address) {
	      this.name = name;
	      this.address = address;
	   }
	   
	   // Getters & Setters
	   public String getName() {
	      return name;
	   }
	   public String getAddress() {
	      return address;
	   }
	   //toString
	   public String toString() {
	      return name + "(" + address + ")";
	   }
	}
public class TestPerson {
  	public static void main(String args[])
  	{
  		Person[] people = new Person[2];
  		people[0] = new Employee("Joe", 999999.0);
  		people[1] = new Student("Jordan", "Science Degree");
  		for (int i = 0; i < 2; i++)
  		{
  			System.out.println(people[i].getName() + "\n" + people[i].getDescription() + "\n--------------");
  		}
  	}
}

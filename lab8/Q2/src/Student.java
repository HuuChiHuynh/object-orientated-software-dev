
public class Student extends Person{
	private String course;
	
	public Student(String name, String course) {
		super(name);
		setCourse(course);
	}
	
	public String getDescription()
	{
		return "A student studying " + getCourse();
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}

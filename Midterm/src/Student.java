
public class Student implements Cloneable {

	private int number = 1;
	private String name = "asdf";

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	protected Object clone() throws CloneNotSupportedException {
		Student student = (Student) super.clone();
		return student;
	}

}

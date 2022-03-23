
public class testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student test = new Student(0, "tets");
		Student student2 = null;

		try {
			student2 = (Student) test.clone();
		}

		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
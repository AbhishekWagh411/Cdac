package assi2;

public class Student extends Person{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int rollNo;
	public Student(int rollNo,String name, int age) {
		super(name, age);
		this.rollNo= rollNo;
		// TODO Auto-generated constructor stub
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo+" Name="+ getName()+" Age="+getAge()+ "]";
	}

}

package studentApp;

public class Student {
	
	public static int studentCount = 0;
	public static int sNumberPrefix = 1000000;
	
	private String firstName;
	private String lastName;
	private String major;
	private double gpa;
	private int sNumber;
	
	public Student(String fName, String lName, String m, double g) {
		
		
		setFName(fName);
		setLName(lName);
		setMajor(m);
		setGpa(g);
		setSnumber();		
		studentCount++;		
		
	}
		
		
	//Methods used to set values
	
	
	public void setFName (String fName) {
		
		firstName = fName;
	}
	
	public void setLName (String lName) {
		
		lastName = lName;
	}
	
	public void setMajor (String m) {
		
		major = m;
	}
	
	public void setGpa (double g) {
		
		gpa = g;
	}
	
	public void setSnumber() {
		
		sNumber = sNumberPrefix + studentCount;
	}
	
	
	// Methods used get values
	
	
	public String getFName() {
		
		return firstName;
	}
	
	public String getLName() {
		
		return lastName;
	}
	
	public String getMajor() {
		
		return major;
	}
	
	public int getSNumber() {
		
		return sNumber;
	}
		
	
	public double getGpa() {
		
		return gpa;
	}
	
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append(sNumber).append("	");
		builder.append(firstName).append("	");
		builder.append(lastName).append("	");
		builder.append("(").append(major).append(")	");
		builder.append(gpa).append("");
		System.out.println("\n");
		
		return builder.toString();
	}
	
	
	@Override
	public boolean equals (Object object) {
	
		boolean result = false;
		
		if (object == null || object.getClass() != getClass()) {
			result = false;
		}
			
		else {
			
			Student student = (Student) object;
			
			if (this.firstName == student.getFName() && this.lastName == student.getLName()   
    		&& this.major == student.getMajor() && this.gpa == student.getGpa()) {
    	
				result = true;
			}
		}
		
		return result;
	}
}
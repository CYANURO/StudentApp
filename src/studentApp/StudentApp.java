package studentApp;

import java.util.*;

public class StudentApp {

	private static Scanner sc;
	private static Student s;
	private static List<Student> newStudentArray = new ArrayList<Student>();

	private static final Student student1 = new Student("Rufo", "Aldo", "CS", 3.54);
	private static final Student student2 = new Student("Pepe", "Juarez", "EE", 3.89);
	private static final Student student3 = new Student("Juanito", "Macao", "MG", 1.89);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int switchScanner;
		
		do {
			
			validateStudentArray();
			printMenu();
			
			sc = new Scanner(System.in);
			switchScanner = sc.nextInt();
			
			switch (switchScanner) {
			
			case 1:
				addStudentMenu();
				break;
				
			case 2:
				findStudent();
				break;
				
			case 3:
				deleteStudent();
				break;
				
			case 4:
				displayAllStudents();
				break;
				
			case 5:
				showNumberOfStudents();
				break;
				
			case 6:
				System.out.println("Good bye!");
				System.out.println();
				break;
				
			default: 
				System.out.println("Sorry, you've entered wrong input. Please try again!");
				System.out.println();
				break;
			}
			
		} while (switchScanner != 6);		
	}
	
	
	private static void printMenu() {
		
		System.out.println("1. Add a student");
		System.out.println("2. Find a student");
		System.out.println("3. Delete a student");
		System.out.println("4. Display all students");
		System.out.println("5. Display the total number of students");
		System.out.println("6. Exit" + "\n");
		System.out.println("Please enter your selection: " + "\n");
		
	}
		
	
	private static void validateStudentArray() {
		
		if(!newStudentArray.contains(student1) && !newStudentArray.contains(student2) && !newStudentArray.contains(student3)) {
			
			newStudentArray.add(student1);
			newStudentArray.add(student2);
			newStudentArray.add(student3);
			
		}
	}


	private static void addStudentMenu() {
		
		sc = new Scanner(System.in);
		
		System.out.println("First Name: ");
		String fN = sc.next();
		
		System.out.println("Last Name: ");
		String lN = sc.next();
		
		System.out.println("Major: ");
		String maj = sc.next();
		
		System.out.println("GPA: ");
		double g = sc.nextDouble();
		
		s = new Student(fN, lN, maj, g);
		newStudentArray.add(s);
		System.out.println("Student: " + s + " has been succesfully added.");
		System.out.println();
		
	}
	
	
	private static void deleteStudent() {
		
		Student returnStudent = null;
		sc = new Scanner(System.in);
		System.out.println("Student with S-number S: ");
		
		int studentNumber = sc.nextInt();
		
		returnStudent = _findStudent(studentNumber);
			
		if (returnStudent != null) {
				
			newStudentArray.remove(returnStudent);
			System.out.println("Student S:" + returnStudent.toString() + " has been succesfully deleted.");
			
		}
		else {

			System.out.println("Student with the S-number S:" + studentNumber + " was not found.");
		}

		System.out.println("\n");					
	}
	
	private static void displayAllStudents() {
		
		for(Student s:newStudentArray) {
			
			System.out.println(s.toString());
		}
		
		System.out.println("\n");
		
	}
	
	private static void showNumberOfStudents() {
		
		System.out.println("The total number of students is: " + newStudentArray.size());
		System.out.println("\n");
		
	}
	
	private static Student _findStudent(int sNumber) {
		
		Student returnStudent = null;
		
		for (Student student : newStudentArray) {
			
			if(student.getSNumber() == sNumber) {
				
				returnStudent = student;
			}
		}
		
		return returnStudent;
		
	}
	
	
	private static void findStudent() {
		
		int newSNumber;
	
		sc = new Scanner(System.in);
		System.out.println("Find student with S-Number S: ");
		
		newSNumber = sc.nextInt();
		
		Student returnStudent = _findStudent(newSNumber);
		
				
		if(returnStudent != null) {

			System.out.println(returnStudent.toString());	
		}
		else {

			System.out.println("Student with the S-number S:" + newSNumber + " was not found.");
			
		}
		
		System.out.println("\n");
	}
}

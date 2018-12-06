
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Student {
	private int studId;
	private String studName;
	private String studAddress;
	private int studMarks;
	private int studAge;
	
	public Student(int studId, String studName, String studAddress, int studMarks, int studAge) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAddress = studAddress;
		this.studMarks = studMarks;
		this.studAge = studAge;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studAddress=" + studAddress + ", studMarks="
				+ studMarks + ", studAge=" + studAge + "]";
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudAddress() {
		return studAddress;
	}

	public void setStudAddress(String studAddress) {
		this.studAddress = studAddress;
	}

	public int getStudMarks() {
		return studMarks;
	}

	public void setStudMarks(int studMarks) {
		this.studMarks = studMarks;
	}

	public int getStudAge() {
		return studAge;
	}

	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}

	
	





private static void checkStudentPassFail(Student[] students) {
	
	for (Student student : students) {
		if(student.getStudMarks()>40){
			System.out.println(student.getStudName()+"   - Pass with marks " +student.getStudMarks());
		}else
			System.out.println(student.getStudName()+"   - Failed with marks " +student.getStudMarks());
		
	}
	
}


private static Student[] takeStudentInfoFromUser() {

	
	Student [] students  = null;
	int noOfStud = 0;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter No of Students :  ");
	noOfStud = sc.nextInt();
	
	students = new Student[noOfStud];
	
	int index = 0;
	
	while(true){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student ID :  ");
		int id = sc.nextInt();
		
		System.out.println("Enter Student Name :  ");
		String name = sc.next();
		
		System.out.println("Enter Student Address :  ");
		String address= sc.next();

		System.out.println("Enter Student Marks:  ");
		int marks = sc.nextInt();
		
		System.out.println("Enter Student Age:  ");
		int age = sc.nextInt();
		
		Student stud = new Student(id,name,address,marks,age);
		if(index < noOfStud ){
			students[index] = stud;
			index++;
		}else{
			System.out.println("Capacity Exceeds");
			break;
		}

		if(index == noOfStud)
			break;

		System.out.println("Do you want to Exit..Yes : yes   --  No : No");
		String choice = sc.next();
		
		if(choice.toLowerCase().trim().equals("Yes")){
			break;
		}
	}
	System.out.println("Students List -- "+ Arrays.toString(students));
	return students;
	
}

}



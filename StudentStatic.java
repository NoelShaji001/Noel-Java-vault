class Student{
	String name;
	//when we declare a variable as final(final int stdCount=0),we cannot increment/decrement or change the value of that variable.
	 static  int  stdCount=0;
	 Student(String name){
		 this.name=name;
		 stdCount++;
		 System.out.println("Student count: "+ getStudentCount());
		 getStudentname();
		
		 
	 }
		 public static int getStudentCount() {
			  return stdCount;
		 }
		 public  void getStudentname() {
			 System.out.println("Student Name:"+name);
		 }
}
public class StudentStatic {
	public static void main(String args[]){
		Student sd1=new Student("Noel");
		Student sd2=new Student("Sigma");
		Student sd3=new Student("Skibidi");
		Student.getStudentCount();
		
	}

}

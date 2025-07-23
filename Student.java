import java.util.Scanner;
class StudentDet{
	String name;
	int age;
	public void displayDetails(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println(name);
		System.out.println(age);	
	}
	
}
public class Student {   
	public static void main(String[]args) {
		StudentDet sd=new StudentDet();
		sd.displayDetails("noel",18);
	}

}

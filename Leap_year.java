
import java.util.Scanner;
public class Leap_year {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a year");
		int year=in.nextInt();
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("The year is a leap year");
				}else {
					System.out.println("The year is not a leap year ");
					
				}
			}else {
				System.out.println("The year is a leap year ");
			}
		}else {
			System.out.println("The year is not a leap year");
		}
	}
}
		
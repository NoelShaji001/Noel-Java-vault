import java.util.Scanner;
public class Numberloop {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a limit:");
		int i;
		int n=in.nextInt();
		for(i=1;i<=n;i++) {
			System.out.println(i);
		}
		in.close();
	}

}

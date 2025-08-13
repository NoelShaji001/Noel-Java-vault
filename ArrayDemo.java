import java.util.Scanner;
public class ArrayDemo {
	public static void printf(String j) {
		System.out.println(j);	
	}
	public static void printf(int n) {
		System.out.print(n);	
	}
	public static void main(String args[]) {
		//Single matrix
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0;i<array.length;i++) {
			printf("Enter elements  for array:");
			array[i]=sc.nextInt();
		}
		printf("Displaying the array:");
		for(int i=0;i<array.length;i++) {
			printf(array[i]);
			printf(" ");
		}
		printf(array[0]+array[1]);
		printf("Alice is American");
	
		
	}

}

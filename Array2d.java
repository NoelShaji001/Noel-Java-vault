import java.util.Scanner;
public class Array2d {
	public static void printf(String j) {
		System.out.print(j);	
	}
	public static void printf(int n) {
		System.out.print(n);	
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		printf("Enter row and columns for array1\n");
		int m=sc.nextInt();
		int n=sc.nextInt();
		printf("enter elements for array1: \n");
		int[][] array1=new int[m][n];
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array1[0].length;j++) {
				 array1[i][j]=sc.nextInt();
			}
		}
		printf("Enter row and column for array2\n");
		int p=sc.nextInt();
		int q=sc.nextInt();
		int[][] array2=new int[p][q];
		printf("Enter elements for array2\n");
		for(int i=0;i<array2.length;i++) {
			for(int j=0;j<array2[0].length;j++) {
				 array2[i][j]=sc.nextInt();
			}
		}
		printf("Perfoming matrix addition.......\n");
		if(m==p&&n==q) {
			for(int i=0;i<array1.length;i++) {
				for(int j=0;j<array1[0].length;j++) {
					array1[i][j]+=array2[i][j];
				}
			}
		printf("Displaying the value.......DOUCHEBAG\n");
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array1[0].length;j++) {
				printf(array1[i][j]);
				printf(" ");
			}
			printf("\n");
		}
		
		
	}else {
		printf("BLEURGHHHHH.......DIE!!!!!\n");
	}
	}

}

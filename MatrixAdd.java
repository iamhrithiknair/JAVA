import java.util.Scanner;

class MatrixAdd{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows:");
		int rows = sc.nextInt();
		System.out.println("Enter the columns:");
		int columns = sc.nextInt();
		
		int[][] matrix1 = new int [rows][columns];
		int[][] matrix2 = new int [rows][columns];
		int[][] result = new int [rows][columns];
		
		System.out.println("Enter elements of first matrix:");
		for(int i=0; i<rows; i++)
			for(int j=0; j<columns; j++)
				matrix1[i][j]=sc.nextInt();
				
		System.out.println("Enter elements of second matrix:");
		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++)
				matrix2[i][j]=sc.nextInt();
				
		//addition
		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++)
				result[i][j]=matrix1[i][j]+matrix2[i][j];
				
		System.out.print("On Addition:");
		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++)
				System.out.print(result[i][j]+" ");
				
			
		}
	}
				

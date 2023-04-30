import java.util.Scanner;

class Exception1{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n = sc.nextInt();
		int [] array = new int[n];
		
		System.out.println("Enter the elements:");
		
		
		
		try{
			int i;
			for( i=0; i<=n; i++){
				
				array[i] = sc.nextInt();
			
		}
	}
		//System.out.println("The array is:");
		//System.out.print(arr[i] + " ");
		
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Error:" +e);
			
		}
	}
}

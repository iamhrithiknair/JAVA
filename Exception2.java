import java.util.Scanner;

class Age{

	static void checkAge(int a) throws ArithmeticException{
		
		try{
			if (a<18){
			
			throw new ArithmeticException("Ineligible");
		}
		
		else{
			System.out.println("Eligible to vote");
		}
	}
		catch(ArithmeticException e){
				System.out.println("An exception is thrown" +e);
				
	}
}
}
class Exception2{
	public static void main(String args[]){
	
		Age age = new Age();	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int a = sc.nextInt();
		
		age.checkAge(a);
	}
}

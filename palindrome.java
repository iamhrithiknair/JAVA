import java.util.Scanner;

class palindrome{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int orig_num = num;
		int reverse = 0;
		
		while(num!=0){
		
			int remainder = num%10;
			reverse=reverse*10+remainder;
			num/=10;
			}
			
		if(orig_num==reverse)
			System.out.println("It is a palindrome");
		else
			System.out.println("Not a palindrome");
			
		}
		
	}

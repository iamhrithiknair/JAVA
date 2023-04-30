import java.util.Scanner;

class staticrev{

	static String reverse(String a, int len){
	
		String b = " ";
		for(int i = len-1; i>=0; i--){
			
			b += a.charAt(i) + "";
			
			}
		return b;
		}
		
		static{
			System.out.println("Static Block");
			}
			
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		String string = " ";
		System.out.println("Enter the String:");
		string = sc.next();
		
		int length = string.length();
		
		String c = " ";
		c = reverse(string, length);
		System.out.println("The reversed string is: " + c);
		
		}
	}
	
	

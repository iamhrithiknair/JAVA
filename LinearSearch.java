import java.util.Scanner;

class LinearSearch{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
			}
			
		System.out.println("Enter data to search:");
		int data = sc.nextInt();
		int flag=0;
		for(int i=0;i<n;i++){
			
			if(arr[i]==data){
				flag=1;
				break;
					}
			else{
				flag=0;
				}
			
			}
		if(flag==1){
			System.out.println("Found");
			}
		else{
			System.out.println("Not Found");
			}
		}
	}

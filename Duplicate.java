import java.util.Scanner;

class Duplicate{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		int flag = 0;
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++){
		
			arr[i]=sc.nextInt();
			}
			
		//System.out.println("New array is:");
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]==arr[j]){
					flag=j;
					for(int k=j+1;k<n;k++){
						arr[flag]=arr[j];
					}
				}
				j--;
				n--;
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
			}
		}
	}

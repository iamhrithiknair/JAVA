//method overloading
import java.util.Scanner;

class volume{

	
	void vol(double radius){
		
		System.out.println("Volume of the sphere is:");
		System.out.println((4*3.14*radius*radius*radius)/3);
		
		}
		
	void vol(double radius,int height){
	
		System.out.println("Volume of the cylinder is:");
		System.out.println((3.14*(radius*radius)*height));
		
		}
		
	void vol(int length,int breadth,int height){
	
		System.out.println("Volume of the cuboid is:");
		System.out.println(length*breadth*height);
		
		}
	}	
class Volume{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int length,breadth,height;
		double radius;
		volume ob = new volume();
		
		System.out.println("Enter the radius of the sphere:");
		radius = sc.nextDouble();
		ob.vol(radius);
		
		System.out.println("Enter the radius of the cylinder:");
		radius = sc.nextDouble();
		System.out.println("Enter the height of the cylinder:");
		height = sc.nextInt();
		ob.vol(radius,height);
		
		System.out.println("Enter the length of the cuboid:");
		length = sc.nextInt();
		System.out.println("Enter the breadth of the cuboid:");
		breadth = sc.nextInt();
		System.out.println("Enter the height of the cuboid:");
		height = sc.nextInt();
		ob.vol(length,breadth,height);
		
		}
	}

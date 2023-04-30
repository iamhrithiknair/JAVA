//concepts of inheritance, method overriding, overloading, constructor overloading, abstract


import java.util.Scanner;

abstract class Shape{

	double dim1,dim2,dim3;
	double r,h;
	
	abstract double volume();
}
	
class Cube extends Shape{
	
	Cube(double a){
		r = a;
		}
	
	double volume(){
		
		return r*r*r;
	}
	
	double volume(double a){
		return a*a*a;
	}
	Cube(Cube object1){
		
		r = object1.r;
	}
}
class Cuboid extends Shape{
	
	Cuboid(double a, double b, double c){
		
		dim1 = a;
		dim2 = b;
		dim3 = c;
		}
		
	double volume(){
		
		return dim1*dim2*dim3;
	}
	
	double volume(double a, double b, double c){
		return a*b*c;
	}
	Cuboid(Cuboid object2){
		
		dim1 = object2.dim1;
		dim2 = object2.dim2;
		dim3 = object2.dim3;
	}
}

class Sphere extends Shape{

	Sphere(double a){
		
		r = a;
	}
	
	double volume(){
		
		return (4*3.14*r*r*r)/3;
	}
	
	double volume(double a){
		return (4*3.14*a*a*a)/3;
	}
	Sphere(Sphere object3){
		
		r = object3.r;
	}
}

class Pyramid extends Shape{

	Pyramid(double a, double b){
		
		r = a;
		h = b;
	}
	
	double volume(){
		
		return (1*r*h)/3;
	}
	
	double volume(double a, double b){
		return (1*a*b)/3;
	}
	
	Pyramid(Pyramid object4){
		
		r = object4.r;
		h = object4.h;
	}
}

class Cylinder extends Shape{
	
	Cylinder(double a, double b){
		
		r = a;
		h = b;
	}
	
	double volume(){
		
		return 3.14*r*r*h;
	}
	
	double volume(double a, double b){
		return 3.14*a*a*b;
	}
	
	Cylinder(Cylinder object5){
		
		r = object5.r;
		h = object5.h;
	}
}

class lab{
	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		double dim1,dim2,dim3;
		double r,h;
	
		Shape shaperef;            //creating a reference of the abstract class Shape
		
		System.out.println("Enter side of the cube:");
		dim1 = sc.nextDouble();
		Cube c = new Cube(dim1);                                         //creating an instance for cube
		System.out.println("Volume of the cube:"+c.volume()); 
		
		System.out.println("Enter length of the cuboid:");
		dim1 = sc.nextDouble();
		System.out.println("Enter breadth of the cuboid:");
		dim2 = sc.nextDouble();
		System.out.println("Enter height of the cuboid:");
		dim3 = sc.nextDouble();
		Cuboid c1 = new Cuboid(dim1,dim2,dim3);                          //creating an instance for cuboid
		
		System.out.println("Volume of the cuboid:"+c1.volume());       //method overriding
		
		System.out.println("Enter radius of the sphere:");        
		r = sc.nextDouble();
		Sphere s = new Sphere(r);										 //creating an instance for sphere
		System.out.println("Volume of the sphere:"+s.volume());
		
		
		System.out.println("Enter the base area of the pyramid:");
		r = sc.nextDouble();
		System.out.println("Enter the height of the pyramid:");
		h = sc.nextDouble();
		Pyramid p = new Pyramid(r,h);									 //creating an instance for pyramid
		System.out.println("Volume of the pyramid:"+p.volume());
		
		System.out.println("Enter the radius of the cylinder:");
		r = sc.nextDouble();
		System.out.println("Enter the height of the cylinder:");
		h = sc.nextDouble();
		Cylinder c2 = new Cylinder(r,h);								 //creating an instance for cylinder
		System.out.println("Volume of the cylinder:"+c2.volume());
		
		
		System.out.print("The copy of the previous volumes:");
		Cube object1 = new Cube(c);
		System.out.println("Volume of the cube:"+object1.volume());
		Cuboid object2 = new Cuboid(c1);
		System.out.println("Volume of the cuboid:"+object2.volume());
		Sphere object3 = new Sphere(s);
		System.out.println("Volume of the sphere:"+object3.volume());
		Pyramid object4 = new Pyramid(p);
		System.out.println("Volume of the pyramid:"+object4.volume());
		Cylinder object5 = new Cylinder(c2);
		System.out.println("Volume of the cylinder:"+object4.volume());
		
		System.out.println("--Method Overloading--");
		System.out.println("Volume of the cube:"+c.volume(3));
		System.out.println("Volume of the cuboid:"+c1.volume(6,7,9));
		System.out.println("Volume of the sphere:"+s.volume(5));
		System.out.println("Volume of the pyramid:"+p.volume(3,5));
		System.out.println("Volume of the cylinder:"+c2.volume(5,10));
	}
}

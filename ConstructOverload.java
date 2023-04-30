//constructor overloading

import java.util.Scanner;

class Constructor{
	int emp_no; 
	String emp_name,designation, department;
	double basic_pay;
	
	
	Constructor(int e_no, String e_name, String d, String det, double b_pay){
	
		emp_no = e_no;
		emp_name = e_name;
		designation = d;
		department = det;
		basic_pay = b_pay;
		
		}
	
	Constructor(Constructor oa){
		
		emp_no = oa.emp_no;
		System.out.println("Employee No:" +emp_no);
		emp_name = oa.emp_name;
		System.out.println("Employee Name:" +emp_name);
		designation = oa.designation;
		System.out.println("Designation:" +designation);
		department = oa.department;
		System.out.println("Department:" +department);
		basic_pay = oa.basic_pay;
		System.out.println("Basic Pay:" +basic_pay);
		
	}
		
	Constructor(){
	
		emp_no = 2344;
		System.out.println("Employee No:" +emp_no);
		
		emp_name = "John";
		System.out.println("Employee Name:" +emp_name);
		
		designation = "Marketing Manager";
		System.out.println("Designation:" +designation);
		
		department = "Marketing";
		System.out.println("Department:" +department);
		
		basic_pay = 91303;
		System.out.println("Basic Pay:" +basic_pay);
		}
	
	void calculate_sal(){
		
		double total_sal = ((0.1*basic_pay)+(0.3*basic_pay)+ basic_pay);
		System.out.println("Total Salary:" +total_sal);
		}
	}
	
class ConstructOverload{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int emp_no; 
		String emp_name,designation, department;
		double basic_pay;
	
		System.out.println("Enter the Employee No:");
		emp_no = sc.nextInt();
		
		System.out.println("Enter the Employee name:");
		emp_name = sc.next();
		
		
		
		
		System.out.println("Enter Designation:");
		designation = sc.next();
		
		
		System.out.println("Enter the Department:");
		department = sc.next();
		
		
		System.out.println("Enter the salary:");
		basic_pay = sc.nextDouble();
		
		Constructor ob = new Constructor(emp_no,emp_name,designation,department,basic_pay);
		ob.calculate_sal();
		
		System.out.println("\n");
		
		Constructor ob1 = new Constructor();
		ob1.calculate_sal();
		
		System.out.println("\n");
		
		Constructor ob2 = new Constructor(ob);
		ob2.calculate_sal();
		
		}
	}
		
		
		

	

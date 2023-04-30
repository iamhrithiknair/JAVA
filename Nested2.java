import java.util.Scanner;

class Outer{
    
    double length;
    double breadth;
    double paintcost;
    
    void calculate_cost(){
        
        Inner inner = new Inner();
        inner.readData();
        inner.display();
    }

class Inner{
    
    void readData(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        length = sc.nextDouble();
        System.out.println("Enter breadth:");
        breadth = sc.nextDouble();
        System.out.println("Enter cost per sqft:");
        paintcost = sc.nextDouble();
    }
    
    void display(){
        
        double result = length*breadth*paintcost;
        System.out.println("Cost of painting is : " + result);
    }
}
}

class Nested2{
    public static void main(String args[]){
        
        Outer outer = new Outer();
        outer.calculate_cost();
    }
}


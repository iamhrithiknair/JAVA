import java.util.Scanner;

class Outer {
    double length;
    double breadth;
    double paintcost;

    class Inner {
        void readData() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length:");
            length = sc.nextDouble();
            System.out.println("Enter breadth:");
            breadth = sc.nextDouble();
            System.out.println("Enter cost per sqft:");
            paintcost = sc.nextDouble();
        }

        void display() {
            double result = length * breadth * paintcost;
            System.out.println("Cost of painting is : " + result);
        }
    }

    void calculate_cost() {
        Inner inner = new Outer().new Inner();
        inner.readData();
        inner.display();
    }
}

class Nested1 {
    public static void main(String args[]) {
        Outer.Inner object = new Outer().new Inner();
        object.readData();
        object.display();
    }
}


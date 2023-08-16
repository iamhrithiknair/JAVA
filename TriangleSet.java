import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Triangle{
    double base;
    double height;
    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double calculateArea(){
        return 0.5*base*height;
    }

    public getBase(){
        return base;

    }

    public getHeight(){
        return height;
    }

    @Override
    public String toString(){
        return "Triangle[Base: " + base + ", Height: " + height + ", Area: " + calculateArea() + "]";

    }
}

public class TriangleSet{
    public static void main(String args[]){
        List<Triangle> triangleSet = new ArrayList<>();
        triangleSet.add(new Triangle(5.0,7.0));
        triangleSet.add(new Triangle(8.0, 10.0));
        triangleSet.add(new Triangle(3.0, 4.0));

        System.out.println("Areas of triangles:");
        for(Triangle tri : triangleSet){
            System.out.println(tri);
        }

        //sort
        Collections.sort(triangleSet, Comparator.comparingDouble(Triangle::calculateArea));
        //print sorted
        System.out.println("Sorted Areas of triangles:");
        for(Triangle tri : triangleSet){
            System.out.println(tri);
        }
}
}
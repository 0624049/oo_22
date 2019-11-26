interface Shape{
    abstract double getArea();
}
class Rectangle implements Shape{

    double length,width;

    public double getArea(){
        double area=length*width;
        return area;
    }
    public void toString(String toStr){

    }
}
class Triangle implements Shape{
    double base,height;

    public double getArea(){
        double area=(base*height)/2;
        return area;
    }
    public void toString(String toStr){

    }
}
public class Main{
    public static void main(String arg[]){
        Rectangle rec;
        rec.getArea(5,9);

        Triangle tri;
        tri.getArea(7,8);
    }
}

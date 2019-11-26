interface Shape{
    abstract void getArea(double area);
}
class Rectangle implements Shape{

    double length,width;

    public void getArea(double length,double width){
        Sytem.out.println("getArea="+length*width);
    }
    public void toString(String toStr){

    }
}
class Triangle implements Shape{
    double base,height;

    public void getArea(double base,double height){
        Sytem.out.println("getArea="+(base*height)/2);
    }
    public void toString(String toStr){

    }
}
public class interface{
    public static void main(String arg[]){
        Rectangle rec;
        rec=new Rectangle(5,9);
        rec.getArea();

        Triangle tri;
        tri=new Triangle(7,8);
        tri.getArea();
    }
}
abstract class CShape{
    protected String color;
    public void setColor(String str){
        color=str;
    }
    public abstract void show();
}
class CTriangle extends CShape{
    protected double a,b,c;
    public CTriangle(double a,double b,double c){
        a=a;
        b=b;
        c=c;
    }
    public void show(){
        System.our.print("color="+color+", ");
        System.our.print("area="+0.5*a*b);
    }

}
public class hw{
    public static void main(String args[]{
    CTriangle CT=new CTriangle(3,4,5);
    CT.setColor("red");
    CT.show();
    })
}

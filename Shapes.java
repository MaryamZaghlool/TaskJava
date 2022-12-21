package shapes;

class circle {

    private double radious;
    private String color;
    final double pi=3.14;

    circle() {

    }

    circle(double radious) {
        this.radious = radious;
    }

    circle(double radious, String color) {
        this.radious = radious;
        this.color = color;

    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "circle{" + "radious=" + radious + ", color=" + color + '}';
    }
    public double getArea(){
        return pi*radious*radious;
    }

}
class cylinder extends circle{
   private double height;
    cylinder(double height) {
        this.height=height;
    }

    cylinder(double height,double radious) {
        super(radious);
        this.height=height;

    }
    cylinder(double height,double radious, String color) {
        super(radious,color);
        this.height=height;

    }
    public double getheight(){
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "cylinder{" + "height=" + height + '}';
    }
    public double getVolume(){
        return super.getArea()*height;
    }
} 

public class Shapes {

    public static void main(String[] args) {
        circle Circle=new circle();
        cylinder Cylinder=new cylinder(7,5);
        System.out.println("The Volume of the Cylinder is : "+Cylinder.getVolume());
        
    }

}

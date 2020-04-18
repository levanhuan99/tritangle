package tritacgle;

public class Shape {
    private String color;
    public Shape(){
    }
    public Shape(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString(){
        return " color is "+getColor();
    }
}
class Tritacgle extends Shape{
    private double side1=1;
    private double side2=1;
    private double side3=1;
    public Tritacgle(){
    }
    public Tritacgle(String color,double side1,double side2,double side3){
        super(color);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea(){
       double area=(Math.sqrt((side1+side2+side3)*(side1+side2-side3)*(side2+side3-side1)*(side1+side3-side2))/4);
       return  area;
    }
    public double getPerimeter(){
        double perimeter=side1+side2+side3;
        return perimeter;
    }

    @Override
    public String toString(){
        return "A tritacgle with 3 side2 are "+getSide1()+","+getSide2()+","+getSide3()+" and "+super.toString();
    }


    public boolean checkCondition(double x,double y,double z){
        if (x>Math.abs(y-z) && x<(y+z)){
            return true;
        }else
            return false;
    }


}

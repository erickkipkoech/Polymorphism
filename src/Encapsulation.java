public class Encapsulation extends AbstractClass{
    private double length,width;
    public Encapsulation(String color, double length,double width){
        super(color);
        System.out.println("Rectangle constructor called");
        this.length=length;
        this.width=width;
    }

    @Override
    double area() {
        return length*width;
    }

    @Override
    public String toString() {
        return "rectangle color is "+super.getColor()+" and the area is "+area();
    }
}

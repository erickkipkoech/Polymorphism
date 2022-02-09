public class PolymorphismClass extends AbstractClass{
    double radius;
    public PolymorphismClass(String color,double radius){
        super(color);
        System.out.println("Polymorphism class called Polymorphism");
        this.radius=radius;

    }

    @Override
    double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle area is "+area()+" and circle color is "+super.getColor();
    }
}

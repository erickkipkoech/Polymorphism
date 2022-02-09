abstract class AbstractClass {
    String color;
    abstract double area();
    public abstract String toString();
    public AbstractClass(String color){
        System.out.println("Abstractclass Constructor called ");
        this.color=color;
    }
    public String getColor(){
        return color;
    }

}

public class Main {
    public static void main(String[] args) {
        AbstractClass a1=new PolymorphismClass("Blue",14);
        AbstractClass a2=new Encapsulation("red",20,30);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}

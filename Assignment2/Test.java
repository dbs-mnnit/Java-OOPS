
public class Test {
    public static void main(String[] args) {
        
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        c1.setRadius(4.5);
        System.out.println(c1);
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
    }
}
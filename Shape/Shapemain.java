package Shape;

public class Shapemain {
    public static void main(String[] args) {
    	Shape shape = new Shape();
    	shape.getArea();
    	
        Rectangle rectangle = new Rectangle(12.12, 11.11);
        double area = rectangle.getArea();
        System.out.println("Area of the rectangle: " + area);
    }
}
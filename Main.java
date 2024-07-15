//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Shape
        System.out.println("-Default Shape:");
        Shape shape1 = new Shape();
        System.out.println(shape1);

        System.out.println("-Defined Shape:");
        Shape shape2 = new Shape("Red",false);
        System.out.println(shape2);
        System.out.println();

        //Circle
        System.out.println("-Default Circle:");
        Circle circle1 = new Circle();
        System.out.println(circle1);

        System.out.println("-Defined Circle:");
        Circle circle2 = new Circle(2.2);
        System.out.println(circle2);
        System.out.println("Circle2 Area:"+circle2.getArea());
        System.out.println("Circle2 Perimeter:"+circle2.getPerimeter());

        System.out.println("-Defined Circle (With defined super attributes):");
        Circle circle3 = new Circle(5.1,"Blue",false);
        System.out.println(circle3);
        System.out.println();

        //Rectangle
        System.out.println("-Default Rectangle:");
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);

        System.out.println("-Defined Rectangle:");
        Rectangle rectangle2 = new Rectangle(4.0,3.0);
        System.out.println(rectangle2);
        System.out.println("Rectangle2 Area:"+rectangle2.getArea());
        System.out.println("Rectangle2 Perimeter:"+rectangle2.getPerimeter());

        System.out.println("-Defined Rectangle (With defined super attributes):");
        Rectangle rectangle3 = new Rectangle(5.0,4.0,"Yellow",false);
        System.out.println(rectangle3);
        System.out.println();

        //Square
        System.out.println("-Default Square:");
        Square square1 = new Square();
        System.out.println(square1);

        System.out.println("-Defined Square:");
        Square square2 = new Square(5.0);
        System.out.println(square2);

        System.out.println("-Get and set square side test:");
        System.out.println(square2.getSide());
        square2.setSide(10);
        System.out.println(square2.getSide());

        System.out.println("-Methods tests:");
        System.out.println("Square2 Area: "+square2.getArea());


        System.out.println("Square2 Perimeter: "+square2.getPerimeter());


        System.out.println("-Defined Square (With defined super attributes):");
        Square square3 = new Square(4.2,"Pink",false);
        System.out.println(square3);
        System.out.println();


    }
}
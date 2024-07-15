public class Rectangle extends Shape {

    double width;
    double length;

    public Rectangle() {
        width=1.0;
        length=1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    //Getters Setters

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //Methods
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="+ width+ " and length="+length+", which is a subclass of "+super.toString();
    }
}

public class Square extends Rectangle{
    public Square(){

    }
    public Square(double side){
       super.setLength(side);
    }
    public Square(double side, String color, boolean filled) {
       super.setLength(side);
       super.setColor(color);
       super.setFilled(filled);
    }
    //Methods

    public void setSide(double side){
         super.setLength(side);
    }
    public double getSide(){
        return super.getLength();
    }

    @Override
    public double getArea() {
        return getSide()*getSide();
    }

    @Override
    public double getPerimeter() {
        return  4*getSide();
    }

    @Override
    public String toString() {
        return "A Square with side="+getSide()+", which is a subclass of "+super.toString();
    }
}

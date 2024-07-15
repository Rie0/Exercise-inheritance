public class Shape {
    String color;
    boolean filled;

    public Shape() {
        color="green";
        filled=true;
    }

    //Getters, Setters
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //Methods

    @Override
    public String toString() {
       if (isFilled()){
           return "A Shape with color of "+ color +" and is filled.";
       }else {
           return "A Shape with color of " + color + " and is Not filled.";
       }
    }
}
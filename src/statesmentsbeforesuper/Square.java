package statesmentsbeforesuper;

public class Square extends Rectangle{

    Square(double length,double breadth){
        if(length < 0) throw new IllegalArgumentException("Length cannot be negative");
        super(length, breadth);
    }

    public static void main(String[] args) {
        Square square = new Square(5, 5);
    }
}
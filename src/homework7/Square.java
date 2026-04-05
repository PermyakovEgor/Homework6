package homework7;

public class Square implements Figure {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double squareArea = (side * side);
        System.out.println("Площадь квадрата: " + squareArea);
        return squareArea;
    }

    @Override
    public double calculatePerimeter () {
        double squarePerimeter = (4 * side);
        System.out.println("Периметр квадрата: " + squarePerimeter);
        return squarePerimeter;
    }
}

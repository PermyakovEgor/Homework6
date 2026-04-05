package homework7;

public class Rectangle implements Figure {

    private int length;
    private int width ;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        double rectangleArea = (length * width);
        System.out.println("Площадь прямоугольника: " + rectangleArea);
        return rectangleArea;
    }

    @Override
    public double calculatePerimeter() {
        double rectanglePerimeter = (length + width) * 2;
        System.out.println("Периметр прямоугольника: " + rectanglePerimeter);
        return rectanglePerimeter;
    }

}

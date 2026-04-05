package homework7;

public class Triangle implements Figure {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double h = (a + b + c) / 2;
        double triangleArea = (Math.sqrt(h * (h - a) * (h - b) * (h - c)));
        System.out.println("Площадь треугольника: " + triangleArea);
        return triangleArea;
    }

    @Override
    public double calculatePerimeter() {
        double trianglePerimeter = a + b + c;
        System.out.println("Периметр треугольника: " + trianglePerimeter);
        return trianglePerimeter;
    }
}

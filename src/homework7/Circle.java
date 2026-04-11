package homework7;

public class Circle implements Figure {
    private int radius;
    private double pi;

    public Circle(double pi, int radius) {
        this.pi = pi;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double circleArea = pi * (radius * radius);
        System.out.println("Площадь круга: " + circleArea);
        return circleArea;
    }

    @Override
    public double calculatePerimeter() {
        double circlePerimeter = ((2 * pi * radius) * 100) / 100;
        System.out.println("Периметр круга: " + circlePerimeter);
        return circlePerimeter;
    }
}

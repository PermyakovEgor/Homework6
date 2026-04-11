package homework7;

public class Main {

    public static void main(String[] args) {

        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(3, 4, 5);
        figures[1] = new Rectangle(7, 3);
        figures[2] = new Circle(3.14, 5);
        figures[3] = new Rhomb(2, 5);
        figures[4] = new Square(4);

        double sumOfPerimeters = 0;
        for (Figure figure : figures) {
            sumOfPerimeters += figure.calculatePerimeter();
        }
        System.out.println("Сумма периметров всех фигур: " + sumOfPerimeters);

        for (Figure figure : figures) {
            figure.calculateArea();
        }
    }
}

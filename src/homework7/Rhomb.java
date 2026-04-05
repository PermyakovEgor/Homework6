package homework7;

public class Rhomb implements Figure {

    private int d1;
    private int d2;

    public Rhomb (int d1, int d2) {
        this.d1 = d1;
        this.d2 = d2;
    }



    @Override
    public double calculateArea() {
        double rhombArea = (d1 * d2) / 2;
        System.out.println("Площадь ромба: " + rhombArea);
        return rhombArea;
    }

    @Override
    public double calculatePerimeter() {
        double rhombPerimeter = Math.round((Math.sqrt((d1 * d1) + (d2 * d2))) * 2 * 100D)/100D;
        System.out.println("Периметр ромба: " + rhombPerimeter);
        return rhombPerimeter;
    }
}

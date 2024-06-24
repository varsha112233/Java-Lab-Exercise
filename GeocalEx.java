package geometrycaluclator;
public class GeocalEx {
    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

}

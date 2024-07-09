package geometrycaluclator;
public class GeocalEx {
public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
       public static double calculateArea(double length, double width) {
        return length * width;
    }
       public static double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        else {
        	  return 0.0; // This else block is just a placeholder, you might have other logic here

        }
    }
    public static void main(String[] args) {
    	double circleArea = calculateArea(5.0);
    	System.out.println("Area of circle:"+circleArea);
    	double rectangleArea = calculateArea(4.0,6.0);
    	System.out.println("Area of rectangle:"+rectangleArea);
    	double triangleArea = calculateArea(3.0,4.0,true);
    	System.out.println("Area of triangle:"+triangleArea);
    }
}
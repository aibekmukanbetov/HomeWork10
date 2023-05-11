public class Circle {

     private static double radius;

    public static void setRadius(double radius) {
        Circle.radius = radius;
    }

    static  double area() {
        return Math.PI* radius* radius;
    }

    static  double circumference() {
        return Math.PI * 2 * radius;
    }
}

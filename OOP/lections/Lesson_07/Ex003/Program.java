package Lesson_07.Ex003;

public class Program {

    public static void main(String[] args) {
        Point3D a = new Point3D(0, 2, 4);

        System.out.println(a.getX());
        // Point2D a = new Point2D(0, 2);
        System.out.println(a.getX());
        System.out.println(a.getY());
        Point3D b = new Point3D(0, 4, 0);
        System.out.println(b);
        // Point2D b = new Point2D(0, 10);

        var dis2D = Point2D.distance(a, b);
        var dis3D = Point3D.distance(a, b);
        System.out.println(dis2D);
        System.out.println(dis3D);
    }
}

package Lesson_07.Ex003;

public class Point3D extends Point2D {
    private int z; // Это координата z

    /**
     * Это конструктор ...
     * 
     * @param valueZ это координата Z
     */
    public Point3D(int valueX, int valueY, int valueZ) {
        super(valueX, valueY);
        z = valueZ;
    }

    public Point3D(int value) {
        this(value, value, value);
    }

    public Point3D() {
        this(0);
    }

    public int getZ() {
        return z;
    }

    public void setZ(int value) {
        this.z = value;
    }

    private String getInfo(){
        return String.format("x: %d; y: %d; z: %d", getX(), getY(), z);
    }
    
    @Override
    public String toString() {
        return getInfo();
    }

    public static double distance(Point3D a, Point3D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2) + Math.pow(a.z - b.z, 2));
    }
}

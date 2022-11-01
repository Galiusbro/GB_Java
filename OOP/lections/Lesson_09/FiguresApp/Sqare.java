package Lesson_09.FiguresApp;

public class Sqare extends Rectangle{

    public Sqare(double sideA) {
        super(sideA, sideA);
    }

    @Override
    public void getArea() {
        System.out.printf("Площадь квадрата равна %,.2f\n", getA()*getA());
    }
}

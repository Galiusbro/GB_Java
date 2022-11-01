package Lesson_09.FiguresApp;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double sideA, double sideB) {
        this.a = sideA;
        this.b = sideB;
    }

    protected double getA(){
        return a;
    }

    public void getArea(){
        System.out.printf("Площадь прямоугольника равна %,.2f\n", a*b);
    }
}


//    private String name;
//    private String voice;
//
//    public Animal(String name, String voice){
//        this.name = name;
//        this.voice = voice;
//    }
//
//    public void speak() {
//        System.out.println(this.name + " says " + this.voice);
//    }
//}

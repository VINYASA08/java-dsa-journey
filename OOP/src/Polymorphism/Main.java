package Polymorphism;

public class Main {
    int age;
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Square square = new Square();

        circle.area();
    }


}

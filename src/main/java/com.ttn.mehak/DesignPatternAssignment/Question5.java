package main.java.com.ttn.mehak.DesignPatternAssignment;

//Implement Bridge Design Pattern for Color and Shape such that
// Shape and Color can be combined together e.g BlueSquare, RedSquare, PinkTriangle etc.

interface Color {
    String color();
}

class Blue implements Color {

    @Override
    public String color() {
        return "Blue";
    }
}

class Pink implements Color {

    @Override
    public String color() {
        return "Pink";
    }
}

class Red implements Color {

    @Override
    public String color() {
        return "Red";
    }
}

class Black implements Color {

    @Override
    public String color() {
        return "Black";
    }
}

abstract class Shape {
    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract String getShape();

    @Override
    public String toString() {
        return "Shape{" +
                "color=" + color +
                '}';
    }
}

class SquareShape extends Shape {
    public SquareShape(Color color) {
        super(color);
    }

    @Override
    public String getShape() {
        return color.color() + "Square";
    }
}

class RectangleShape extends Shape {
    public RectangleShape(Color color) {
        super(color);
    }

    @Override
    public String getShape() {
        return color.color() + "Rectangle";
    }
}

class TriangleShape extends Shape {
    public TriangleShape(Color color) {
        super(color);
    }

    @Override
    public String getShape() {
        return color.color() + "Triangle";
    }
}

public class Question5 {
    public static void main(String[] args) {
        Shape shape1 = new SquareShape(new Red());
        System.out.println(shape1.getShape());

        Shape shape2 = new TriangleShape(new Black());
        System.out.println(shape2.getShape());

        Shape shape3 = new RectangleShape(new Blue());
        System.out.println(shape3.getShape());
    }
}

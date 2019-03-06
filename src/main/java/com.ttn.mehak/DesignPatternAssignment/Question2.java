package main.java.com.ttn.mehak.DesignPatternAssignment;

//Implement Factory Pattern to get the Polygon of different type.

import java.util.Scanner;

abstract class Polygon {
    abstract void getType();
}

class Square extends Polygon {

    @Override
    void getType() {
        System.out.println("This is a Square.");
    }
}

class Triangle extends Polygon {

    @Override
    void getType() {
        System.out.println("This is a Triangle.");
    }
}

class Pentagon extends Polygon {

    @Override
    void getType() {
        System.out.println("This is a Pentagon.");
    }
}

class Hexagon extends Polygon {

    @Override
    void getType() {
        System.out.println("This is a Hexagon.");
    }
}

class GetPolygonFactory {
    public Polygon getPolygon(int side) {
        if (side == 4)
            return new Square();
        else if (side == 3)
            return new Triangle();
        else if (side == 5)
            return new Pentagon();
        else if (side == 6)
            return new Hexagon();

        return null;
    }
}

public class Question2 {
    public static void main(String[] args) {
        GetPolygonFactory getPolygonFactory = new GetPolygonFactory();

        System.out.println("Enter the number of sides of Polygon:");
        Scanner scanner = new Scanner(System.in);
        Polygon p = getPolygonFactory.getPolygon(scanner.nextInt());
        p.getType();


    }
}

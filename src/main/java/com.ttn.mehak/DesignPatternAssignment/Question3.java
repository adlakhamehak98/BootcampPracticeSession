package main.java.com.ttn.mehak.DesignPatternAssignment;

//Implement Abstract Factory Pattern to create cars of different categories from different countries.

import java.util.Scanner;

enum Country {
    CANADA, INDIA, JAPAN
}

abstract class Cars {
    Country country;

    public Cars(Country country) {
        this.country = country;
    }

    abstract String getCarCategory();

    @Override
    public String toString() {
        return "Car{" +
                "country= " + country + " ,Category= " + getCarCategory() +
                '}';
    }
}


class Santro extends Cars {

    public Santro(Country country) {
        super(country);
    }

    @Override
    public String getCarCategory() {
        return "HYUNDAI";
    }
}

class Frontenac extends Cars {

    public Frontenac(Country country) {
        super(country);
    }

    @Override
    public String getCarCategory() {
        return "FORD";
    }
}

class Altima extends Cars {

    public Altima(Country country) {
        super(country);
    }

    @Override
    public String getCarCategory() {
        return "NISSAN";
    }
}

class IndianCarFactory {
    static Cars buildCar(String carType) {
        Cars car = null;
        switch (carType) {
            case "santro":
                car = new Santro(Country.INDIA);
                break;
            case "frontenac":
                car = new Frontenac(Country.INDIA);
                break;
            case "altima":
                car = new Altima(Country.INDIA);
                break;
        }
        return car;
    }
}

class CanadaCarFactory {
    static Cars buildCar(String carType) {
        Cars car = null;
        switch (carType) {
            case "santro":
                car = new Santro(Country.CANADA);
                break;
            case "frontenac":
                car = new Frontenac(Country.CANADA);
                break;
            case "altima":
                car = new Altima(Country.CANADA);
                break;
        }
        return car;
    }
}

class JapanCarFactory {
    static Cars buildCar(String carType) {
        Cars car = null;
        switch (carType) {
            case "santro":
                car = new Santro(Country.JAPAN);
                break;
            case "frontenac":
                car = new Frontenac(Country.JAPAN);
                break;
            case "altima":
                car = new Altima(Country.JAPAN);
                break;
        }
        return car;
    }
}

class CarFactory {

    static Cars buildCar(String carType, Country country) {
        Cars car = null;
        switch (country) {
            case INDIA:
                car = IndianCarFactory.buildCar(carType);
                break;
            case JAPAN:
                car = JapanCarFactory.buildCar(carType);
                break;
            case CANADA:
                car = CanadaCarFactory.buildCar(carType);
                break;
        }
        return car;
    }
}


public class Question3 {
    public static void main(String[] args) {
        System.out.println("Please enter Car Types choice:" +
                "\n1. Santro" +
                "\n2. Altima" +
                "\n3. Frontenac");
        Scanner scanner1 = new Scanner(System.in);
        String carType = scanner1.nextLine();
        System.out.println("Please enter Country choice:" +
                "\n1. India" +
                "\n2. Canada" +
                "\n3. Japan");
        Scanner scanner2 = new Scanner(System.in);
        Country country = Country.valueOf(scanner2.nextLine().toUpperCase());

        System.out.println(
                CarFactory.buildCar(carType, country));
    }
}
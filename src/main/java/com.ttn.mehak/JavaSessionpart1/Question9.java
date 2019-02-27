package main.java.com.ttn.mehak.JavaSessionpart1;

//Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)
enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}

class House {

    int price;
    String location;
    String city;
    Month month;

    House(int price, String location, String city, Month month) {
        this.price = price;
        this.location = location;
        this.city = city;
        this.month = month;
    }

    public void getPrice() {
        System.out.println("Location : " + this.location);
        System.out.println("City : " + this.city);
        System.out.println("Price : " + this.price);
        System.out.println("Month : " + this.month.name());
    }
}

public class Question9 {
    public static void main(String[] args) {
        House house = new House(3600000, "Sector 41", "Noida", Month.AUGUST);
        house.getPrice();
    }
}

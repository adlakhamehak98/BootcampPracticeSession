package main.java.com.ttn.mehak.DesignPatternAssignment;

//Implement Decorator pattern to decorate the Pizza with topings.

interface Pizza{
    String decorate();
}

class PizzaImplementation implements Pizza{
    public String decorate(){
        return "Pizza Ready";
    }
}

class PizzaDecorator implements Pizza{
    private Pizza pizza;

    public PizzaDecorator(Pizza pizza) {   //constructor
        this.pizza = pizza;
    }

    public  String decorate(){
        return pizza.decorate();
    }
}

class Jalapeno extends PizzaDecorator{

    public Jalapeno(Pizza pizza) {
        super(pizza);
    }

    public String decorate(){       //custom method
        return super.decorate()+decorateWithJalapeno();
    }

    public String decorateWithJalapeno(){
        return " with jalapeno topping.";
    }
}

class Corn extends PizzaDecorator{

    public Corn(Pizza pizza) {
        super(pizza);
    }

    public String decorate(){
        return super.decorate()+decorateWithCorn();
    }

    public String decorateWithCorn(){
        return " with corn topping.";
    }
}

class Olives extends PizzaDecorator{

    public Olives(Pizza pizza) {
        super(pizza);
    }

    public String decorate(){
        return super.decorate()+decorateWithOlives();
    }

    public String decorateWithOlives(){
        return " with olives topping.";
    }
}

public class Question6 {
    public static void main(String[] args) {
        Pizza pizza1 = new PizzaDecorator(new PizzaImplementation());
        System.out.println(pizza1.decorate());

        Pizza pizza2 = new Jalapeno(new PizzaImplementation());
        System.out.println(pizza2.decorate());

        Pizza pizza3 = new Olives(new PizzaImplementation());
        System.out.println(pizza3.decorate());

        Pizza pizza4 = new Corn(new Olives(new PizzaImplementation())); //combining more than 1 topping
        System.out.println(pizza4.decorate());
    }
}

package main.java.com.ttn.mehak.DesignPatternAssignment;

//Implement Singleton Design Pattern on a dummy class.

class Dummy {
    private static Dummy instance;

    private Dummy() {
    }

    public static Dummy getInstance() {
        if (instance == null) {
            synchronized (Dummy.class) {
                if (instance == null) {
                    instance = new Dummy();
                }
            }
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Singleton");
    }
}

public class Question1 {
    public static void main(String[] args) {
        Dummy dummy = Dummy.getInstance();
        dummy.doSomething();

        Dummy dummy1 = Dummy.getInstance(); //same reference as dummy is created
        dummy1.doSomething();

        System.out.println(dummy == dummy1);  //since it is true, this is a singleton class
    }
}

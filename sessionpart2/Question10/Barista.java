package sessionpart2.Question10;

class Barista extends Person {
    private Order order;

    Order getOrder() {
        return order;
    }

    Barista(String name, int age, Long contact) {
        super(name, age, contact);
    }

    void takeOrder(Order order) {
        System.out.println(getName() + " took order " + order.id + " from queue.");
        this.order = order;
    }

    void preparesCoffee() {
        System.out.println(getName() + " prepared Coffee for " + order.getCustomer().getName());
    }

    void notifyCustomer() {
        System.out.println(getName() + " notifies that Coffee for " + order.getCustomer().getName() + " is ready.");
    }
}

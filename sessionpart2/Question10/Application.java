package sessionpart2.Question10;

import java.util.ArrayList;
import java.util.List;

/**
 * Design classes having attributes and method(only skeleton) for a coffee shop. There are three different actors in our scenario and i have listed the different actions they do also below
 * <p>
 * Customer
 * - Pays the cash to the cashier and places his order, get a token number back
 * - Waits for the intimation that order for his token is ready
 * - Upon intimation/notification he collects the coffee and enjoys his drink
 * ( Assumption:  Customer waits till the coffee is done, he wont timeout and cancel the order. Customer always likes the drink served. Exceptions like he not liking his coffee, he getting wrong coffee are not considered to keep the design simple.)
 * <p>
 * Cashier
 * - Takes an order and payment from the customer
 * - Upon payment, creates an order and places it into the order queue
 * - Intimates the customer that he has to wait for his token and gives him his token
 * ( Assumption: Token returned to the customer is the order id. Order queue is unlimited. With a simple modification, we can design for a limited queue size)
 * <p>
 * Barista
 * - Gets the next order from the queue
 * - Prepares the coffee
 * - Places the coffee in the completed order queue
 * - Places a notification that order for token is ready
 **/
public class Application {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        Customer customer = new Customer("Mehak", 24, 9654773125L);
        Customer customer1 = new Customer("Gandhi", 22, 9654673125L);
        Cashier cashier = new Cashier("Siddharth", 22, 9845654459L);
        Cashier cashier1 = new Cashier("Veer", 24, 9845654462L);
        Barista barista = new Barista("Sagar", 25, 98456455559L);

        customer.orders();
        orders.add(cashier.receivesOrder(customer, 646.84f));
        customer.waits();

        customer1.orders();
        orders.add(cashier1.receivesOrder(customer1, 6461.4f));
        customer.waits();

        for (Order order : orders) {
            System.out.print("Pending Orders : { ");
            for(Order order1 : orders) {
                System.out.print(order.getId()+" ,");
            }
            System.out.println("}");
            barista.takeOrder(order);
            barista.preparesCoffee();
            barista.notifyCustomer();
            barista.getOrder().getCustomer().collectsOrder();
            orders.remove(order);
        }
    }
}

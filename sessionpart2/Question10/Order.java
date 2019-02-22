package sessionpart2.Question10;

import java.util.UUID;

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
public class Order {
    //Universally Unique Identifier a 128-bit long value that is unique for all.A UUID is made of up of hex digits
    // (4 chars each) along with 4 “-” symbols which make its length equal to 36 characters.
    UUID id;
    private float amount;
    private Customer customer;
    private Cashier cashier;

    Order(float amount, Customer customer, Cashier cashier) {
        id = UUID.randomUUID();
        this.amount = amount;
        this.customer = customer;
        this.cashier = cashier;
    }

    UUID getId() {
        return id;
    }

    public float getAmount() {
        return amount;
    }

    Customer getCustomer() {
        return customer;
    }

    public Cashier getCashier() {
        return cashier;
    }
}

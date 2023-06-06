package Market;

public interface QueueBehaviour {
    void addCustomer(Customer customer);
    void completeOrder(Customer customer);
    void removeCustomer(Customer customer);
    void setMakeOrder();
    void setTakeOrder();
    boolean isMakeOrder();
    boolean isTakeOrder();
}
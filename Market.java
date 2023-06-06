package Market;

import java.util.*;
import java.util.Iterator;

public abstract class Market implements QueueBehaviour, MarketBehaviour {
    // implementation of QueueBehaviour methods
    List<Customer> customer = new LinkedList<>();
    Queue<Customer> customerQueue = new ArrayDeque<>();
    ArrayList<String> arraylist = new ArrayList<String>();
    Iterator<String> it = arraylist.iterator();

    int i = 0;

    public void addCustomer(Customer customer) {
         customerQueue.add(customer);
        IFunc<Integer, String> test1 = x -> "Шаг " + i;
          arraylist.add(test1.apply(i++) + " " + customer.getName() + " встал(а) в очередь");
      }

    public void removeCustomer() {
         IFunc<Integer, String> test1 = x -> "Шаг " + i;
         arraylist.add(test1.apply(i++) + " " + customerQueue.peek().getName() + " покинул(а) очередь");
         printQueue(arraylist);
        customerQueue.poll();
    }

    public void printQueue(ArrayList<String> arraylist){
        for (String s : arraylist) {
            System.out.println(s);
        }
    }

    public void acceptOrder() {
          IFunc<Integer, String> test1 = x -> "Шаг " + i;
        customerQueue.peek().isTakeOrder();
         arraylist.add(test1.apply(i++) + " " + customerQueue.peek().getName() + " забрал(а) заказ");
     }


    public void completeOrder() {
         IFunc<Integer, String> test1 = x -> "Шаг " + i;
        customerQueue.peek().isMakeOrder();
        arraylist.add(test1.apply(i++) + " " + customerQueue.peek().getName() + " сделал(а) заказ");
     }


    public void update() {
        // update market state based on current orders and customers
    }


}
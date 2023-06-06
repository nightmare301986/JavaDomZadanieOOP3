/*
1)В предыдущем ДЗ добавить реализацию собственного функционального интерфейса.
2)Реализовать любой выбранный интерфейс из списка (Iterator<E>, Iterable<E>, Comparator<E>, Comparable<E>) в предыдущем ДЗ,
предоставив собственную реализацию.
 */

package Market;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer hm = new Customer();
        System.out.println("Введите имя покупателя");
        Scanner scanner = new Scanner(System.in);
        String buyerName = scanner.nextLine();
        hm.name = buyerName;
        scanner.close();

        Market market = new Market() {
            @Override
            public void setMakeOrder() {

            }

            @Override
            public void setTakeOrder() {

            }

            @Override
            public boolean isMakeOrder() {
                return false;
            }

            @Override
            public boolean isTakeOrder() {
                return false;
            }

            @Override
            public void removeCustomer(Customer customer) {

            }

            @Override
            public void completeOrder(Customer customer) {

            }

            @Override
            public void acceptOrder(Customer customer) {

            }
        };

        market.addCustomer(hm);
        market.completeOrder();
        market.acceptOrder();
        market.removeCustomer();
        market.update();
    }
}

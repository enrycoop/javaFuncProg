package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer ben = new Customer("Ben", "23782389932");
        greetCustomer( ben );
        greetCustomerConsumer.accept( ben );
        greetCustomerConsumerV2.accept(ben, false);
    }

    // Common way ...
    static void greetCustomer(Customer c) {
        System.out.println("Hello " +
                c.cName +
                ", thanks for registring " +
                "your phone number : " +
                c.cPhoneNum);
    }

    // Functional programming way ...

    static Consumer<Customer> greetCustomerConsumer = c ->
            System.out.println("Hello " +
                    c.cName +
                    ", thanks for registring " +
                    "your phone number : " +
                    c.cPhoneNum);

    // BIconsumer
    static BiConsumer<Customer,Boolean> greetCustomerConsumerV2 =
            (c, showNum) -> System.out.println("Hello " +
                    c.cName +
                    ", thanks for registring " +
                    "your phone number : " +
                    (showNum ? c.cPhoneNum : "****************")
            );

    static class Customer {
        private final String cName;
        private final String cPhoneNum;

        public Customer(String cName, String cPhoneNum) {
            this.cName = cName;
            this.cPhoneNum = cPhoneNum;
        }
    }

}

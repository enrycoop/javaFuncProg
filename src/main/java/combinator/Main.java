package combinator;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice.test@test.com",
                "+39 6537278329",
                LocalDate.of(2000, 1, 1)
        );

        System.out.println( new CustomerValidatorService().isValid(customer));
        // I get True or False but I don't know why (what is the false element...)

        // Try the ney interface
        // with combinator pattern

        System.out.println( "Combination pattern validation : " +
                CustomerRegistrationValidator.isEmailValid()
                .and(CustomerRegistrationValidator.isAdult())
                .and(CustomerRegistrationValidator.isPhoneValid())
                .apply(customer)
        );

    }
}

package combinator;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPhoneNumValid(String phoneNUm) {
        return phoneNUm.startsWith("+39");
    }

    private boolean isAdult(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 18;
    }

    public boolean isValid (Customer customer) {
        return isEmailValid(customer.getEmail()) &&
                isPhoneNumValid(customer.getPhoneNum()) &&
                isAdult(customer.getDob());
    }
}
